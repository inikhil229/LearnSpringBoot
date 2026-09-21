package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

//    @Bean(initMethod = "startCall",destroyMethod = "stop") // one more way to initialization callbacks and destruction of the bean
//    public CartService getCartBean(){
//        return  new CartService();
//    }

}
