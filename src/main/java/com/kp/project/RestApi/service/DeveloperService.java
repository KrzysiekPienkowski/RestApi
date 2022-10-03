package com.kp.project.RestApi.service;

import com.kp.project.RestApi.model.Developer;
import com.kp.project.RestApi.repository.DeveloperRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DeveloperService {

    private DeveloperRepository developerRepository;

    public List<Developer> getAllDevelopers() {
        return developerRepository.findAll();
    }

    public Developer save(Developer newDeveloper) {
        return developerRepository.save(newDeveloper);
    }
}
