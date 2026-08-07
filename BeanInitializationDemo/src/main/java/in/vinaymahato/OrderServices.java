package in.vinaymahato;

import org.springframework.context.PayloadApplicationEvent;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class OrderServices {
    PaymentServices paymentServices;
public OrderServices(@Lazy PaymentServices paymentServices){
    this.paymentServices=paymentServices;
    }

    public void PlaceOrder(){
    paymentServices.pay();
            System.out.println("Order Placed.");
        }

        public static void getOrderDetails(){
            System.out.println("See the Details of Orders");
            System.out.println("Mango");
            System.out.println("Apple");
            System.out.println("Banana");
        }
    }

