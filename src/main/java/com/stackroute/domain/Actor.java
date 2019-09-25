package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Actor {

    private String name;
    private String gender;
    private int age;

    @Autowired
    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "\nname='" + name + '\'' +
                ", \ngender='" + gender + '\'' +
                ", \nage=" + age +
                '}';
    }
}
