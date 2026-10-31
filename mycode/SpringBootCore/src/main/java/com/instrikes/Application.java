package com.instrikes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
	static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);

        OrderService order = context.getBean(OrderService.class);
        order.placeOrder();
	}

}
