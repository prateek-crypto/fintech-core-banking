package com.prateek.bank.fintech.sandbox.notification.impl;

import com.prateek.bank.fintech.sandbox.notification.NotificationChannel;
import org.springframework.stereotype.Component;

@Component
public class PushChannel implements NotificationChannel {

    @Override
    public String sendNotification(String accountNumber, String message) {

        return "PUSH Notification sent to "
                + accountNumber;
    }

}