package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    @Autowired
    private PaymentService payment;

//    public OrderService(PaymentService payment){
//        this.payment = payment;
//    }

    public void placeOrder(){
        payment.pay();
        getOrderDetails();
        System.out.println("Order placed");
    }

    public void getOrderDetails(){
        System.out.println("Order details");
    }
}
