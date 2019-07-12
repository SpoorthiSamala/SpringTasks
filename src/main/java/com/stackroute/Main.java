package com.stackroute;

import com.stackroute.domain.BeanLifecycleDemoBean;
import com.stackroute.domain.BeanPostProcessorDemoBean;
import com.stackroute.domain.Movie;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {
    public static void main(String args[]){
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("file:src/beans.xml");

        BeanLifecycleDemoBean beanLifecycleDemoBean=context.getBean("lifecycle",BeanLifecycleDemoBean.class);

        Movie movie=context.getBean("movie",Movie.class);
        movie.display();

        BeanPostProcessorDemoBean beanPostProcessorDemoBean = context.getBean("postProcessorBean", BeanPostProcessorDemoBean.class);
        context.close();
    }
}
