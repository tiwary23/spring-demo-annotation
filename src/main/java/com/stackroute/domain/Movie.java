package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {


    private Actor actor1;

    @Autowired
    public void setActor(Actor actor1) {
        this.actor1 = actor1;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor1=" + actor1 +
                '}';
    }
}
