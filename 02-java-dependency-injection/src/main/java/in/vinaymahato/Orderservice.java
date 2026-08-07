package in.vinaymahato;
import in.vinaymahato.notification.Emailservices;
import in.vinaymahato.notification.NotificationServices;
import in.vinaymahato.notification.PopUpNotification;

public class Orderservice {
    NotificationServices notification;
    public Orderservice(NotificationServices notification){
        this.notification=notification;
    }
    public void Placeorder(){
        System.out.println("Order Placed");
        notification.sendnotification();
    }
}
