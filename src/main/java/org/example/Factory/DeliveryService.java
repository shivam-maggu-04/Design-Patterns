package org.example.Factory;

public class DeliveryService {
    public void sendNotification()  {
        Notification notification = NotificationFactory.setNotification("SMS");
        notification.send();
    }
}
