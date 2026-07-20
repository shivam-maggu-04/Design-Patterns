package org.example.Factory;

public class DeliveryService {
    public void sendNotification()  {
        NotificationFactory factory = new EmailFactory();
        Notification notification = factory.createNotification();
        notification.send();
    }
}
