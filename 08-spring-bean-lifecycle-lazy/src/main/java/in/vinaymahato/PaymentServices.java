package in.vinaymahato;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class PaymentServices {

    OrderServices orderServices;
    public PaymentServices(OrderServices orderServices){
        this.orderServices=orderServices;
    }

    public void pay(){
        System.out.println("Payment successfull");
        OrderServices.getOrderDetails();
    }
}
