package in.vinaymahato;

import in.vinaymahato.Payment.PaymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class OrderServices {

    private PaymentService paymentService;

    // Constructor Injection
    public OrderServices(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void PlaceOrder() {
        paymentService.pay();
        System.out.println("Order Placed..Thank You!");
    }
}