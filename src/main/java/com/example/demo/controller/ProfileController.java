package com.example.demo.controller;

import com.example.demo.model.entity.ProfileEntity;
import com.example.demo.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RestController
@RequestMapping("api/profile")
@CrossOrigin("*")
public class ProfileController {

    public static final Path CURRENT_FOLDER = Paths.get(System.getProperty("user.dir"));
    @Autowired
    private ProfileService profileService;

    @GetMapping("")
    public List<ProfileEntity> get() {
        return profileService.getAll();
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public ProfileEntity create(
            @RequestParam String name,
            @RequestParam String bio,
            @RequestParam MultipartFile image
            ) throws IOException {
        return profileService.save(name, bio, image);
    }

    @PutMapping("")
    public ProfileEntity update(
            @RequestParam String name,
            @RequestParam String bio,
            @RequestParam MultipartFile image
    ) throws IOException {
        return profileService.save(name, bio, image);
    }
}
