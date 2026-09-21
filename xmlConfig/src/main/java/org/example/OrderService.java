package org.example;
import org.springframework.stereotype.Component;


public class OrderService {

    private PaymentService payment;

//    public OrderService(PaymentService payment){
//        this.payment = payment;
//        System.out.println("order service created by ioc");
//    }

    public void setPaymentService(PaymentService payment){
        this.payment = payment;
    }


    public void placeOrder(){
        payment.pay();
        System.out.println("Order placed");
    }
}
