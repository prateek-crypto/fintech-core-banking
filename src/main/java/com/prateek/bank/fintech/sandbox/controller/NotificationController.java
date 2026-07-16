package com.prateek.bank.fintech.sandbox.controller;

import com.prateek.bank.fintech.sandbox.notification.NotificationChannel;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    // Default implementation selected using @Primary
    private final NotificationChannel defaultChannel;

    // Specific implementation selected using @Qualifier
    private final NotificationChannel smsChannel;

    // Constructor Injection
    public NotificationController(
            NotificationChannel defaultChannel,

            @Qualifier("smsChannel")
            NotificationChannel smsChannel) {

        this.defaultChannel = defaultChannel;
        this.smsChannel = smsChannel;
    }

    @GetMapping("/api/v1/sandbox/routing")
    public String routing() {

        String defaultNotification = defaultChannel.sendNotification(
                "ACC-101",
                "Salary Credited Successfully");

        String smsNotification = smsChannel.sendNotification(
                "ACC-101",
                "Suspicious Login Detected");

        return """
                ================================
                FINTECH NOTIFICATION SANDBOX
                ================================

                Default Channel (@Primary)

                %s


                SMS Channel (@Qualifier)

                %s

                ================================
                """
                .formatted(defaultNotification, smsNotification);
    }
}