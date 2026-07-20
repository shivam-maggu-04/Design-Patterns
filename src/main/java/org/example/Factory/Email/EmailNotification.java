package org.example.Factory.Email;

import org.example.Factory.Notification;

public class EmailNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Email Notification");
    }
}
