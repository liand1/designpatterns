package com.lee.designpattern.observer.publisher;

import com.lee.designpattern.observer.subscriber.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Receptionist implements Employee {

    List<Employee> employees = new ArrayList<>();


    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void cancelEmployee(Employee employee) {
        Objects.requireNonNull(employees);

        employees.remove(employee);
    }

    @Override
    public void update() {
        System.out.println("boss is coming");
        notifyEmployees();
    }

    private void notifyEmployees() {
        employees.forEach(Employee::update);
    }

}

