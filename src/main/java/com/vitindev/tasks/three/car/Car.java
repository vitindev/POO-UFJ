package com.vitindev.tasks.three.car;

public class Car extends Vehicle {

    private final int numberOfPorts;

    public Car(String model, int numberOfPorts) {
        super(model);
        this.numberOfPorts = numberOfPorts;
    }

    public void display() {
        System.out.println("Model: " + getModel());
        System.out.println("Number of Ports: " + numberOfPorts);
    }

}
