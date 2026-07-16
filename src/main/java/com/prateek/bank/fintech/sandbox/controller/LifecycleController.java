package com.prateek.bank.fintech.sandbox.controller;

import com.prateek.bank.fintech.sandbox.lifecycle.DatabaseConnection;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LifecycleController {

    private final DatabaseConnection databaseConnection;

    public LifecycleController(DatabaseConnection databaseConnection) {

        this.databaseConnection = databaseConnection;

    }

    @GetMapping("/api/v1/sandbox/lifecycle")
    public ResponseEntity<String> lifecycleDemo() {

        return ResponseEntity.ok(
                databaseConnection.getConnectionStatus()
        );

    }

}