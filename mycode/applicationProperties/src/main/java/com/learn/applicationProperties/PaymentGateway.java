package com.learn.applicationProperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PaymentGateway {


//    @Value("${paymentGateway.type:razorPay}") // :razorpay for the default value if the property is not in application properties file
//    private String type;
//
//    @Value("${paymentGateway.retryCount:5}")  // :5 for the default value if the property is not in application properties file
//    private int retryCount;

//    public PaymentGateway(@Value("${paymentGateway.type}") String type,
//                          @Value("${paymentGateway.retryCount}") int retryCount){
//        this.type = type;
//        this.retryCount = retryCount;
//    }

    PaymentProperties paymentProperties;

    public PaymentGateway(PaymentProperties paymentProperties){
        this.paymentProperties = paymentProperties;
    }

    public String getType() {
        return paymentProperties.getType();
    }


    public boolean isEnabled() {
        return paymentProperties.getIsEnabled();
    }


    public int getRetryCount() {
        return paymentProperties.getRetryCount();
    }


    public int getTimeout() {
        return paymentProperties.getTimeout();
    }


    public void print(){
        System.out.println(getType());
        System.out.println(getRetryCount());
        System.out.println(getTimeout());
        System.out.println(isEnabled());
    }


}
