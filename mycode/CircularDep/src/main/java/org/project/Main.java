package org.project;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService order = context.getBean(OrderService.class);

        OrderService order2 = context.getBean(OrderService.class);

//        order.placeOrder();
        System.out.println(order == order2);
    }
}
