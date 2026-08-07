package in.vinaymahato;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class orderService {
    @Autowired
    private paymentService PaymentServices;

//    orderService(paymentService PaymentServices){
//        this.PaymentServices=PaymentServices;
//    }

    public void PlaceOrder(){
        PaymentServices.Pay();
        // Call here to solve circular dependencies
        orderService.getOrderDetails();

        System.out.println("Order Placed...Thank you!");


    }

    public static void getOrderDetails() {
        System.out.println("===== Order Details =====");
        System.out.println("Order ID   : ORD1001");
        System.out.println("Product    : Laptop");
        System.out.println("Brand      : Dell");
        System.out.println("Quantity   : 1");
        System.out.println("Price      : ₹55,000");
        System.out.println("Payment    : UPI");
        System.out.println("Status     : Confirmed");
        System.out.println("=========================");
    }
}
