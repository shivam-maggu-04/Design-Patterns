package org.example.Factory.Email;

import org.example.Factory.Template;

public class EmailTemplate implements Template {

    @Override
    public void format() {
        System.out.println("Formatting Email");
    }
}
