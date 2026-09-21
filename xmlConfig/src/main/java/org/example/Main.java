package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    static void main() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//        OrderService order = (OrderService) context.getBean("orderService"); // get bean by bean's unique id

//        OrderService order = context.getBean(\\OrderService.class); // get bean by type , but works only when there's only 1 bean with the classname if there's 2 bean with the same class name then it will work

        // way to get multiple beans using the bean type with the same class name but with different ids
//        OrderService order2 = context.getBean("orderService2",OrderService.class);
        OrderService order = context.getBean(OrderService.class);

//        PaymentService payment = context.getBean(PaymentService.class);

        order.placeOrder();
//        payment.pay();
    }
}
