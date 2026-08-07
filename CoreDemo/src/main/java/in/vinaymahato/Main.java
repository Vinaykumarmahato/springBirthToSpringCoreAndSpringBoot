package in.vinaymahato;

import in.vinaymahato.notification.*;

public class Main {
    public static void main(String[] args) {
        NotificationServices notificatio =new FakeEmailServices();
        Orderservice order = new Orderservice(notificatio);
        order.Placeorder();
    }
}
// Dependency Injection
// Agar ek class ko kuchh chahiye to wo kisi se mang le rather than ki
// wo khud se banane lage