package in.vinaymahato.notification;

public class FakeEmailServices implements NotificationServices{
    @Override
    public void sendnotification(){
        System.out.println("Dummy Email Sent");
    }
}
