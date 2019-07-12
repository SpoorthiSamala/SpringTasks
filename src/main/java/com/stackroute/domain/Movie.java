package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
    private Actor actor;
    private String beanName;

    public Movie(Actor actor) {
        this.actor = actor;
    }


    public void display(){
        actor.displayActorDetails();
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("This is application context");
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("This is bean factory");

    }

    public void setBeanName(String s) {
        System.out.println("Bean Name: " + s);
    }
}
