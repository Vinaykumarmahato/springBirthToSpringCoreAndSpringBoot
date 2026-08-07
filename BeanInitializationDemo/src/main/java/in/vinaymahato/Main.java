package in.vinaymahato;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
    OrderServices order1=context.getBean(OrderServices.class);
//        System.out.println("Payment Services is not Started Ye");
    order1.PlaceOrder();
//    PaymentServices payment=context.getBean(PaymentServices.class);

    }
}