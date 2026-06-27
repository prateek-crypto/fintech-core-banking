package com.prateek.bank.account.controller;

import com.prateek.bank.account.service.BankingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    // Dependency Injection
    private final BankingService bankingService;

    // Constructor Injection
    public WelcomeController(BankingService bankingService) {
        this.bankingService = bankingService;
    }

    // Welcome API
    @GetMapping("/welcome")
    public String welcome() {
        return bankingService.getBankStatus();
    }

    // Fee Calculation API
    @GetMapping("/fee")
    public String calculateFee(double amount) {

        double fee = bankingService.calculateTransferFee(amount);

        return "The calculated transfer fee for ₹" +
                amount +
                " is: ₹" +
                fee;
    }
}