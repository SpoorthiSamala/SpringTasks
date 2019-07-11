package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String args[]){
        ApplicationContext context=new ClassPathXmlApplicationContext("file:src/beans.xml");
        Movie mov=context.getBean("movie",Movie.class);
        mov.display();
        Movie mov1=context.getBean("movie1",Movie.class);
        mov1.display();

    }
}
