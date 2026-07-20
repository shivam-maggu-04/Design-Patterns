package org.example.Factory;

import org.example.Factory.Email.EmailFactory;

public class DeliveryService {
    public void sendNotification()  {
        NotificationFactory factory = new EmailFactory();
        Notification notification = factory.createNotification();
        notification.send();
        Template template= factory.createTemplate();
        template.format();
    }
}
