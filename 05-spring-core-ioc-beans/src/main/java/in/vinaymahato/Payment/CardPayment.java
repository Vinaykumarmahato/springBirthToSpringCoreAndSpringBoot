package in.vinaymahato.Payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CardPayment implements PaymentService{

    @Override
//    @Qualifier("CP")
    public void pay(){
        System.out.println("Paying via a Card");
    }
}
