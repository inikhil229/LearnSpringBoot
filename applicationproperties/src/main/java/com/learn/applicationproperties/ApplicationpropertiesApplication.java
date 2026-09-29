package com.learn.applicationproperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ApplicationpropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ApplicationpropertiesApplication.class, args);

		PaymentGateway payment = context.getBean(PaymentGateway.class);
//		payment.setTyep("paytm"); before using the application properties
//		payment.setRetryCount(1);

		System.out.println(payment.getType() + " " + payment.getRetryCount());

	}

}
