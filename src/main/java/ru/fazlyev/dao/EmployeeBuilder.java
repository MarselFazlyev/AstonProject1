package ru.fazlyev.dao;

import ru.fazlyev.models.Employee;

public class EmployeeBuilder {
    private String firstName;
    private String lastName;
    private String employeeId;
    private String email;
    public EmployeeBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public EmployeeBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public EmployeeBuilder setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
        return this;
    }

    public EmployeeBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public Employee buildEmployee() {
        return new Employee(firstName,lastName, employeeId, email);
    }
}