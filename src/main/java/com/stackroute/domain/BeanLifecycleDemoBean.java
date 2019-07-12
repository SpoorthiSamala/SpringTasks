package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    public void customInit(){
        System.out.println("Init");
    }

    public void customDestroy(){
        System.out.println("Destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Initialization method called");
    }

    public void destroy() throws Exception {
        System.out.println("destroy method called");
    }
}

