package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Movie {

    @Autowired
    @Qualifier("actor1")
    private Actor actor;



    @Override
    public String toString() {
        return "Movie{" +
                "actor1=" + actor +
                '}';
    }
}
