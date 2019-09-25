package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Movie {


    private Actor actor1;

    @Autowired
    public Movie(Actor actor1) {
        this.actor1 = actor1;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor1=" + actor1 +
                '}';
    }
}
