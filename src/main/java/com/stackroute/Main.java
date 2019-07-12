package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;


public class Main {
    public static void main(String args[]){
        ApplicationContext context=new ClassPathXmlApplicationContext("file:src/beans.xml");
        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("src/beans.xml"));
        Movie movie=context.getBean("movie",Movie.class);
        movie.display();

    }
}
