package com.example.demo.service.impl;

import com.example.demo.model.entity.ProfileEntity;
import com.example.demo.repository.ProfileRepository;
import com.example.demo.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static com.example.demo.controller.ProfileController.CURRENT_FOLDER;

@Service
public class ProfileServiceImpl implements ProfileService {
    @Autowired
    private ProfileRepository profileRepository;

    @Override
    public List<ProfileEntity> getAll() {
        return (List<ProfileEntity>)
                profileRepository.findAll();
    }

    @Override
    public ProfileEntity save(String name, String bio, MultipartFile image) throws IOException {
        Path staticPath = Paths.get("static");
        Path imagePath = Paths.get("images");

        ProfileEntity profile = new ProfileEntity();
        profile.setId(1);
        profile.setName(name);
        profile.setBio(bio);
        if (image != null && !image.isEmpty()) {
            Path file = CURRENT_FOLDER.resolve(staticPath)
                    .resolve(imagePath)
                    .resolve(image.getOriginalFilename());

            try (OutputStream os = Files.newOutputStream(file)) {
                os.write(image.getBytes());
            }
            profile.setImage(
                    imagePath.resolve(image.getOriginalFilename())
                            .toString());
        }
        else profile.setImage(null);

        return profileRepository.save(profile);

    }

}
