package org.example.Factory;

public class NotificationFactory {

    public static Notification setNotification(String typeNotification) {
        if(typeNotification.equals("EMAIL")){
            return new EmailNotification();
        }
        else if(typeNotification.equals("SMS")){
            return new SmsNotification();
        }
        throw new IllegalArgumentException("Invalid Type");

    }
}
