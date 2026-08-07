package in.vinaymahato.notification;

public class EmailServices implements notificationservice {

    @Override
    public void sendnotification(){
        System.out.println("Email Notification Has Sent...");
    }
}
