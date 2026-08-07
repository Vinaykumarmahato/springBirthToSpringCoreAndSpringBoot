package in.vinaymahato;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
//
//        OrderServices order0=context.getBean(OrderServices.class);
//        OrderServices order1=context.getBean(OrderServices.class);
//
//        System.out.println(order0==order1);

    }
}