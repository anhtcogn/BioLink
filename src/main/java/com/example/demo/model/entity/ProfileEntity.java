package com.example.demo.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "profile")
public class ProfileEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String bio;

    @Lob
    private String image;

    public ProfileEntity(Integer id, String name, String bio, String image) {
        this.id = id;
        this.name = name;
        this.bio = bio;
        this.image = image;
    }

    public ProfileEntity() {

    }
}