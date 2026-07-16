package com.prateek.bank.fintech.sandbox.notification.impl;

import com.prateek.bank.fintech.sandbox.notification.NotificationChannel;
import org.springframework.stereotype.Component;

@Component("smsChannel")
public class SmsChannel implements NotificationChannel {

    @Override
    public String sendNotification(String accountNumber, String message) {

        return "SMS sent to Account : "
                + accountNumber
                + " | Message : "
                + message;
    }

}