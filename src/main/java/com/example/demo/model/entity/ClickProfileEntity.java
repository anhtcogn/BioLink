package com.example.demo.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "click_profile")
public class ClickProfileEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "click_count")
    private Long clickCount;
    private LocalDate date;

    @Column(name = "profile_id")
    private Integer profileId;
}
