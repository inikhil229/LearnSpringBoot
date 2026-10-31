package org.project;
import org.springframework.stereotype.Component;


@Component
public class OrderService {
    private final PaymentService payment;

    public OrderService(PaymentService payment){
        this.payment = payment;
    }

    public void placeOrder(){
        payment.pay();
        System.out.println("Order placed");
    }
}
