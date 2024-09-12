package com.vitindev.tasks.three.employee;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Employee {

    private final String name;
    private final float salary;

    public double calcTotalSalary() {
        return salary;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Total salary: " + calcTotalSalary());
        System.out.println();
    }

}
