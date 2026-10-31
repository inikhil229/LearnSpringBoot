package org.project.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Primary // primary annotation is used to give the priority when  spring is confused in payment services , which one to pass in the constructor
@Qualifier("upay")
public class UpiPayment implements PaymentService{
    @Override
    public void pay(){
        System.out.println("Paid using upi");
    }
}
