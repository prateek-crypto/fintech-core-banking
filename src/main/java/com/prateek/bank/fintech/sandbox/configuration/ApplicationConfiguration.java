package com.prateek.bank.fintech.sandbox.configuration;

import com.prateek.bank.fintech.sandbox.external.Address;
import com.prateek.bank.fintech.sandbox.external.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public Address address() {

        System.out.println("Creating Address Bean");

        return new Address(
                "Mumbai",
                "India"
        );
    }

    @Bean
    public Employee employee() {

        System.out.println("Creating Employee Bean");

        return new Employee(
                "EMP-1001",
                address()
        );
    }

}