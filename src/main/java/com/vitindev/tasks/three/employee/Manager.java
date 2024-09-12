package com.vitindev.tasks.three.employee;

public class Manager extends Employee {

    private final float bonus;

    public Manager(String name, float salary, float bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public double calcTotalSalary() {
        return super.calcTotalSalary() + bonus;
    }

    @Override
    public void display() {
        System.out.println("Bonus: " + bonus);
        super.display();
    }
}
