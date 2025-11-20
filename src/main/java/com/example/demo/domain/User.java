package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String name;
    @NotNull
    private int age;
    @NotNull
    private int gender;
    private String location;
    private String advancedInformation;
    protected User() {}


    public User(String name, int age, int gender, String location, String advancedInformation) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.location = location;
        this.advancedInformation = advancedInformation;
    }

}
