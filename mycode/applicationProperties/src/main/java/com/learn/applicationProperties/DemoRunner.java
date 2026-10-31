package com.learn.applicationProperties;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoRunner implements ApplicationRunner {
    private PaymentGateway payment;

    public DemoRunner(PaymentGateway payment){
        this.payment = payment;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        payment.print();
    }
}
