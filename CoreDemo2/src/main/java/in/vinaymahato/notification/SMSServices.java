package in.vinaymahato.notification;

public class SMSServices implements notificationservice {
    @Override
    public void sendnotification(){
        System.out.println("SMS Notification has sent");
    }
}
