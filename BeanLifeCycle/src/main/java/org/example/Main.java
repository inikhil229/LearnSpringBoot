package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        OrderServic order = context.getBean(OrderServic.class);
//        order.placeOrder();

        CartService cart = context.getBean(CartService.class);
        System.out.println(cart.getValue(1));

        context.close();
    }


}
