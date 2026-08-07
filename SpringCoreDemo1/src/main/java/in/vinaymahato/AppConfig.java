package in.vinaymahato;

import in.vinaymahato.Payment.CardPayment;
import in.vinaymahato.Payment.PaymentService;
import in.vinaymahato.Payment.UPIpayment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("in.vinaymahato")
public class AppConfig {

    @Bean
    public User createUser(){
        return new User(22,"Vinay");
    }
    @Bean
    public CartServices createCartServices(){
        return new CartServices();
    }

    @Bean
    @Qualifier("CP")
    public PaymentService CreateCardPayement(){
        return  new CardPayment();

    }

    @Bean
    @Qualifier("UPI")
    public PaymentService CreateUPIPayment(){
        return new UPIpayment();
    }

    @Bean
    public OrderServices CreateOrderServices(@Qualifier("UPI") PaymentService paymentService){
    return new OrderServices(paymentService);
    }


}
