package com.learn.applicationproperties;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PaymentGateway {

    private String type;
    private int retryCount;

    public PaymentGateway(@Value("$(paymentGateway.type)") String type, @Value("$(paymetGateway.retryCount)") int retryCount){
        this.type = type;
        this.retryCount = retryCount;
    }

    public String getType() {
        return type;
    }

    public void setTyep(String type) {
        this.type = type;
    }

    public int getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }





}
