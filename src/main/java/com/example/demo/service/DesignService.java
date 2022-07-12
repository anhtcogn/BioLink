package com.example.demo.service;

import com.example.demo.model.entity.DesignEntity;

import java.util.List;

public interface DesignService {

    DesignEntity update(DesignEntity designEntity);

    List<DesignEntity> getAll();

    DesignEntity getDesignById(Long id);
    void delete(Long id);

}
