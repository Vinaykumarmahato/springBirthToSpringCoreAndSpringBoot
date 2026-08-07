package in.vinaymahato;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class paymentService {
    @Autowired
    orderService OrderServices;
//    public paymentService(orderService OrderServices){
//        this.OrderServices=OrderServices;
//    }
    public void Pay(){
        System.out.println("Payment Done.");

//        orderService.getOrderDetails();
    }
}
