package com.prateek.bank.account.service;

import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
public class BankingService {
    private static int instanceCount = 0;
    private int requestCounter = 0;
    @PostConstruct
    public void init() {
        instanceCount++;
        System.out.println(" [LIFECYCLE-INIT] BankingService Bean Created");
        System.out.println(" Total BankingService Instances: " + instanceCount);
    }
    @PreDestroy
    public void destroy() {
        System.out.println("🛑 [LIFECYCLE-DESTROY] BankingService Bean Destroyed");
    }
    public String getBankStatus() {
        requestCounter++;
        return "FinTech Core Banking System is Running | Requests Served: " + requestCounter;
    }
    public double calculateTransferFee(double amount) {
        return amount * 0.02;
    }
}