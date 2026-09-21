package org.example;
import org.springframework.stereotype.Component;

public class PaymentService {

    private String type;
    private int retryCount;

    public PaymentService(String type,int retrycountl){
        this.type = type;
        this.retryCount = retrycountl;
    }

    public void pay(){
        System.out.println("Payment done with "+type + " and the retrycount is " + retryCount);
    }
}
