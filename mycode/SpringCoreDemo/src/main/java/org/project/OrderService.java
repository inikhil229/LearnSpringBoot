package org.project;

import org.project.payment.PaymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

//    @Autowired // use the autowired annotation above the referrence variable for the field injection , constructor or setter method is not required for the DI
    private final PaymentService payment;


//    constructor injection
    public OrderService(@Qualifier("upay") PaymentService payment){
        this.payment = payment;
    }


//    setter injection without using the constructor method
//    @Autowired is used above the setter method so the spring injects dependency using the setter method
//    public void setPayment(PaymentService payment){
//        this.payment = payment;
//    }

    public void placeOrder(){
        payment.pay();
        System.out.println("Order placed");
    }
}