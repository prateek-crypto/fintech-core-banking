package com.prateek.bank.fintech.sandbox.controller;

import com.prateek.bank.fintech.sandbox.external.Address;
import com.prateek.bank.fintech.sandbox.external.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationController {

    private final Address address;
    private final Employee employee;

    public ConfigurationController(Address address,
                                   Employee employee) {

        this.address = address;
        this.employee = employee;
    }

    @GetMapping("/api/v1/sandbox/configuration")
    public ResponseEntity<String> configurationDemo() {

        String result = """
========================================
CONFIGURATION BEAN DEMO
========================================

Address Bean HashCode :

%d

Employee Address HashCode :

%d

Same Address Object ?

%s

Employee Id :

%s

========================================
"""
                .formatted(

                        address.hashCode(),

                        employee.getAddress().hashCode(),

                        address == employee.getAddress(),

                        employee.getEmployeeId()

                );

        return ResponseEntity.ok(result);

    }

}