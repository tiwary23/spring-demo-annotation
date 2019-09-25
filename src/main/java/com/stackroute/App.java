package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;




public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext("com.stackroute");
        System.out.println("Application context configured");
        Movie movie=context.getBean("MovieA",Movie.class);
        System.out.println(movie);

        Movie movie1=context.getBean("MovieB",Movie.class);
        System.out.println(movie1);

        System.out.println("MovieA==MovieB: " +
                ""+(movie==movie1));





    }
}
