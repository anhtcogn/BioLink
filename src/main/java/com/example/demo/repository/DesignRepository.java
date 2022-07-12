package com.example.demo.repository;

import com.example.demo.model.entity.DesignEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesignRepository extends JpaRepository<DesignEntity, Long> {

    DesignEntity findOneById(Long id);
}
