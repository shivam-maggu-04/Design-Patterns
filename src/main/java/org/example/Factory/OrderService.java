package org.example.Factory;

public class OrderService {

    public void sendNotification()  {
        Notification notification = NotificationFactory.setNotification("EMAIL");
        notification.send();
    }
}
