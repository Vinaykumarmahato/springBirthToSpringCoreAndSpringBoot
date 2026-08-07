package in.vinaymahato;
import in.vinaymahato.notification.EmailServices;
import in.vinaymahato.notification.notificationservice;

public class OrderSomething {

    public  void Placeorder(){
        notificationservice notification=new EmailServices();
        System.out.println("Order has placed");
        notification.sendnotification();
    }

}
