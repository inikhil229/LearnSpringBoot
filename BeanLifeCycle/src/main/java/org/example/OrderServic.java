package org.example;

import org.springframework.stereotype.Component;

@Component
public class OrderServic {
    private final PaymentService payment;

    public OrderServic(PaymentService payment){
        this.payment = payment;
    }

    public void placeOrder(){
        payment.pay();
        System.out.println("Order Placed");
    }
}
