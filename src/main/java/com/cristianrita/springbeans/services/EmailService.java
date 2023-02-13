package com.cristianrita.springbeans.services;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class EmailService implements Sender {
    public EmailService() {
        System.out.println("EmailService created!");
    }

    @Override
    public void send(String to, String message) {
        System.out.println("Sending email to " + to + " with message " + message);
    }
}
