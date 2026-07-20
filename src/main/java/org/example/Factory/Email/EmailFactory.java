package org.example.Factory.Email;

import org.example.Factory.Notification;
import org.example.Factory.NotificationFactory;
import org.example.Factory.Template;

public class EmailFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }

    @Override
    public Template createTemplate() {
        return new EmailTemplate();
    }
}
