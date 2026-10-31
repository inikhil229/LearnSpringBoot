
//this is a special class which is used for the application properties instead of writing @Value
//annotation on the variables, make a special class using the @ConfigurationProperties annotation and with the prefix
//name in parameter and the property name should start with the prefix name , ex - paymentGateway.type, paymentGateway.retrycount

package com.learn.applicationProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties("payment-gateway")
public class PaymentProperties {
    private String type;
    private int retryCount;
    private boolean isEnabled;
    private  int timeout;

    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }

    public boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public int getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }
}
