package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.demo.BeanPostProcessorDemoBean;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class BeansConfig {

    @Bean({"MovieA"})
    @Scope("prototype")
    public Movie movie(){
        return new Movie();
    }

    @Bean("MovieB")
    public Movie movie1(){
        return new Movie();
    }

    @Bean
    public Actor actor1(){
        return new Actor("Akshay","male",56);
    }

    @Bean
    public Actor actor2(){
        return new Actor("Poorvi","female",21);
    }

    @Bean
    public Actor actor3(){
        return  new Actor("Raj","male",40);
    }

    @Bean
    public BeanLifecycleDemoBean beanLifecycleDemoBean(){
        return new BeanLifecycleDemoBean();
    }

    @Bean
    public BeanPostProcessorDemoBean beanPostProcessorDemoBean(){
        return new BeanPostProcessorDemoBean();
    }

}
