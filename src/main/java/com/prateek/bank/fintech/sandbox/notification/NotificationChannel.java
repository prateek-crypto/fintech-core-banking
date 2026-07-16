package com.prateek.bank.fintech.sandbox.notification;

public interface NotificationChannel {

    String sendNotification(String accountNumber, String message);

}