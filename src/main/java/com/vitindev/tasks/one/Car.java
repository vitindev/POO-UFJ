package com.vitindev.tasks.one;

public class Car {

    private final int year;
    private final String brand, model, licensePlate;

    public Car(int year, String brand, String model, String licensePlate) {
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
    }

    public int getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void showClass() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("License Plate: " + licensePlate);
    }

}
