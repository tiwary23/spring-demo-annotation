package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext("com.stackroute");
        System.out.println("Application context configured");
        Movie movie=context.getBean("movie",Movie.class);
        System.out.println(movie);

        BeanFactory factory= new AnnotationConfigApplicationContext("com.stackroute");
        System.out.println("Bean Factory configured");
        Movie movie1=factory.getBean("movie",Movie.class);
        System.out.println(movie1
        );



    }
}
