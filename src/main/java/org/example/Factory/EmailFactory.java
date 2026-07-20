package org.example.Factory;

public class EmailFactory implements  NotificationFactory{
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
