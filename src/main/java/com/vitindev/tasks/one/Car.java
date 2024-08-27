package com.vitindev.tasks.one;

public record Car(int year, String brand, String model, String licensePlate) {

    public void showClass() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("License Plate: " + licensePlate);
    }

}
