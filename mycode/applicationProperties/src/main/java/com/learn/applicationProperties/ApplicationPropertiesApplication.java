package com.learn.applicationProperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ApplicationPropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ApplicationPropertiesApplication.class, args);

        PaymentGateway payment = context.getBean(PaymentGateway.class);

//        System.out.println(payment.getType());
//        System.out.println(payment.getRetryCount());
//        System.out.println(payment.getTimeout());
//        System.out.println(payment.isEnabled());
//        payment.print();
	}

}
