package org.project;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class OrderService {


    public OrderService(){
        System.out.println("Order service created");
    }

    public void placeOrder(){
        System.out.println("Order placsed");
    }

    public void getOrderDetails(){
        System.out.println("Order details");
    }

}
