package in.vinaymahato;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Scope("singleton")
public class OrderServices {

    public OrderServices(){
        System.out.println("OrderServices Created");
    }
    public  void  OrderPlace(){

        System.out.println("Order Placed..");
    }
}
