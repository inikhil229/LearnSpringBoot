package org.example;
import org.springframework.stereotype.Component;

public interface PaymentService {

//    private String type;
//    private int retryCount;
//
//    public PaymentService(String type,int retrycountl){
//        this.type = type;
//        this.retryCount = retrycountl;
//    }

    void pay();
}
