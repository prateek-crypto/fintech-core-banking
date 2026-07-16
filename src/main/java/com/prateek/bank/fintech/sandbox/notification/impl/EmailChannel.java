package com.prateek.bank.fintech.sandbox.notification.impl;

import com.prateek.bank.fintech.sandbox.notification.NotificationChannel;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailChannel implements NotificationChannel {

    @Override
    public String sendNotification(String accountNumber, String message) {

        return "EMAIL sent to Account : "
                + accountNumber
                + " | Message : "
                + message;
    }

}