package in.vinaymahato.notification;

public class SmsServices implements NotificationServices{
    @Override
    public  void sendnotification(){
        System.out.println("SMS Notification Sent");
    }
}
