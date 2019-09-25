package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {


    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy Bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After Property set");

    }

    @PostConstruct
    public void initMethod(){
        System.out.println("Init");
    }

    @PreDestroy
    public void destroyMethod(){
        System.out.println("destroy");
    }
}
