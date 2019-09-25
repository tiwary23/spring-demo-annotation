package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {

    @Value("Akshay")
    private String name;

    @Value("Male")
    private String gender;

    @Value("56")
    private int age;



    public void setName(String name) {
        this.name = name;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }


    public void setAge(int age) {
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
