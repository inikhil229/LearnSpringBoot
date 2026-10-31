package org.project;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class UserService implements BeanNameAware, ApplicationContextAware {

    @Override
    public void setBeanName(String name){
        System.out.println("bean name is " + name);
    }
    public UserService(){
        System.out.println("user service constructor");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("application context is " + applicationContext);
    }
}
