package org.example.Factory;

import org.example.Factory.Sms.SmsFactory;

public class OrderService {
    public void sendNotification()  {

        NotificationFactory factory = new SmsFactory();
        Notification notification = factory.createNotification();
        notification.send();
        Template template= factory.createTemplate();
        template.format();
    }
}
