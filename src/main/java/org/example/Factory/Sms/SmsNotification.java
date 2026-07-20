package org.example.Factory.Sms;

import org.example.Factory.Notification;

public class SmsNotification implements Notification {
    @Override
    public void send() {
        System.out.println("SMS Notification");
    }
}
