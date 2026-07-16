package com.prateek.bank.fintech.sandbox.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConnection {

    public DatabaseConnection() {

        System.out.println("====================================");
        System.out.println("STEP 1 : Constructor Executed");
        System.out.println("DatabaseConnection Object Created");
        System.out.println("====================================");

    }

    @PostConstruct
    public void initialize() {

        System.out.println("====================================");
        System.out.println("STEP 2 : @PostConstruct Executed");
        System.out.println("Database Connection Established");
        System.out.println("====================================");

    }

    public String getConnectionStatus() {

        return "Database Connection is ACTIVE";

    }

    @PreDestroy
    public void destroy() {

        System.out.println("====================================");
        System.out.println("STEP 3 : @PreDestroy Executed");
        System.out.println("Closing Database Connection");
        System.out.println("====================================");

    }

}