package com.kp.project.RestApi.repository;

import com.kp.project.RestApi.model.Developer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeveloperRepository extends JpaRepository<Developer,Integer> {
}
