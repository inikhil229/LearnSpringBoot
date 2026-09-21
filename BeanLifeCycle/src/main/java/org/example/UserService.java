package org.example;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

//@Component
public class UserService implements BeanNameAware, ApplicationContextAware {

    @Override
    public void setBeanName(String name){
        System.out.println("bean name is "+name);
    }

    @Override
    public void setApplicationContext(ApplicationContext context){

    }
}
