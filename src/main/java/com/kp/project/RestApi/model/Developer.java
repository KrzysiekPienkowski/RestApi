package com.kp.project.RestApi.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Developer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String position;

}
