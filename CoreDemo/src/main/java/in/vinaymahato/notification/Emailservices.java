package in.vinaymahato.notification;

public class Emailservices implements NotificationServices{

    @Override
    public  void sendnotification(){
        System.out.println("Email Notification sent");
    }
}
