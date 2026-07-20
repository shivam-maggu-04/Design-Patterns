package org.example.Factory.Sms;

import org.example.Factory.Notification;
import org.example.Factory.NotificationFactory;
import org.example.Factory.Template;

public class SmsFactory implements NotificationFactory {

    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }

    @Override
    public Template createTemplate() {
        return new SmsTemplate();
    }
}
