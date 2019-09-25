package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class BeansConfig {

    @Bean({"MovieA","MovieB"})
    @Scope("prototype")
    public Movie movie(){
        return new Movie(actor());
    }

    @Bean
    public Actor actor(){
        return new Actor("Akshay","male",56);
    }

    @Bean
    public Actor actor1(){
        return new Actor("Poorvi","female",21);
    }

    @Bean
    public Actor actor2(){
        return  new Actor("Raj","male",40);
    }

}
