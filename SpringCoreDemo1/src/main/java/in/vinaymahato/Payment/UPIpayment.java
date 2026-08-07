package in.vinaymahato.Payment;

import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Component;

//@Component
public class UPIpayment implements PaymentService {

    @Override
//    @Qualifier("UP")
    public void pay() {
        System.out.println("Paying via UPI");
    }
}