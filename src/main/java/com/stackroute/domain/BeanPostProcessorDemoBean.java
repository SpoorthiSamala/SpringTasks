package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorDemoBean implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("Before Initialization");
        return null;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("After Initialization");
        return null;
    }
}
