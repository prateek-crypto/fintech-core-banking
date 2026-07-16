package com.prateek.bank.fintech.sandbox.external;

public class Employee {

    private final String employeeId;
    private final Address address;

    public Employee(String employeeId, Address address) {
        this.employeeId = employeeId;
        this.address = address;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public Address getAddress() {
        return address;
    }
}