package com.example.demo.service;

import com.example.demo.model.entity.ProfileEntity;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ProfileService {

    ProfileEntity save(String name,
                       String bio,
                       MultipartFile image) throws IOException;
    List<ProfileEntity> getAll();

    //ProfileEntity update(ProfileEntity profileEntity);
}


