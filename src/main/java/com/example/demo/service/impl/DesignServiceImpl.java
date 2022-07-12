package com.example.demo.service.impl;

import com.example.demo.model.entity.DesignEntity;
import com.example.demo.repository.DesignRepository;
import com.example.demo.service.DesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DesignServiceImpl implements DesignService {

    @Autowired
    private DesignRepository designRepository;

    @Override
    public DesignEntity update(DesignEntity designEntity) {
        return designRepository.save(designEntity);
    }

    @Override
    public List<DesignEntity> getAll() {
        return (List<DesignEntity>)
                designRepository.findAll();
    }

    @Override
    public DesignEntity getDesignById(Long id) {
        DesignEntity designEntity = designRepository.findOneById(id);
        return designEntity;
    }

    @Override
    public void delete(Long id) {
        DesignEntity designEntity = designRepository.findOneById(id);
        designRepository.delete(designEntity);
    }
}
