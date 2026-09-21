package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

//     @Autowired // this is the field injection , directly using the autowired annotation above the variable without constructor or setter
    private final PaymentService paymentService;

    @Autowired // constructor injection
    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    // setter injectin using a setter method
//    public void setPaymentService(PaymentService paymentService){
//        this.paymentService = paymentService;
//    }

    public void placeOrder(){
        paymentService.pay();
        System.out.println("order placed");
    }
}
