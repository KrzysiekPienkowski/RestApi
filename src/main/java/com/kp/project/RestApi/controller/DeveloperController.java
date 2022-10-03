package com.kp.project.RestApi.controller;

import com.kp.project.RestApi.model.Developer;
import com.kp.project.RestApi.service.DeveloperService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.rmi.ServerException;
import java.util.List;

@RestController
@AllArgsConstructor
public class DeveloperController {

    private DeveloperService developerService;

    @GetMapping(value = "/developers")
    public List<Developer> getDevelopers() {
        return developerService.getAllDevelopers();
    }

    @PostMapping(path = "developers",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Developer> create(@RequestBody Developer newDeveloper) throws ServerException {
        Developer developer = developerService.save(newDeveloper);
        if (developer == null) {
            throw new ServerException("");
        } else {
            return new ResponseEntity<>(developer, HttpStatus.CREATED);
        }
    }
}
