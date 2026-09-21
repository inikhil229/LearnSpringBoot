package org.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Lazy
public class CartService implements BeanNameAware, ApplicationContextAware {
    //    InitializingBean ,DisposableBean


    Map<Integer, String> map;

//    @Override
//    public void afterPropertiesSet() throws Exception{ // must be override after implementing the initializingBean interface for the initialization callbacks
//        map.clear();
//        System.out.println("map cleared successfully");
//        map.put(1,"nikhil");
//        map.put(2,"R");
//    }

    public CartService(){
        map = new HashMap<>();
        System.out.println("cartservice constructor called");
    }

    @Override
    public void setBeanName(String name) {
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }

    public void addToCart(){
        System.out.println("added to cart");
    }

    public String getValue(int key){
        return map.get(key);
    }

//    public void startCall(){
//        map.clear();
//        System.out.println("map cleared successfully");
//        map.put(1,"nikhil");
//        map.put(2,"R");
//    }

    @PostConstruct // most common and most used way for the initialization callbacks by directly writing annotation on the method which you want to call
    public void start2(){
        map.clear();
        System.out.println("map cleared successfully");
        map.put(1,"nikhil");
        map.put(2,"R");
    }



//    @Override
//    public void destroy() throws Exception {
//        System.out.println("destroying the bean");
//        map.clear();
//    }

    @PreDestroy
    public void stop(){
        System.out.println("bean is getting destroyed using predestroy");
        map.clear();
    }


}
