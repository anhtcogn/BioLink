package com.example.demo.repository;

import com.example.demo.model.entity.ClickProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClickProfileRepository extends JpaRepository<ClickProfileEntity, Long> {
}
