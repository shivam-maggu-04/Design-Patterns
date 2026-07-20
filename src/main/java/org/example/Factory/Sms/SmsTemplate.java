package org.example.Factory.Sms;

import org.example.Factory.Template;

public class SmsTemplate implements Template {

    @Override
    public void format() {
        System.out.println("Formatting SMS");
    }
}
