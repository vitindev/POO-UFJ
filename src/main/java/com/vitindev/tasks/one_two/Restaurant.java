package com.vitindev.tasks.one_two;

public record Restaurant(String name, String cuisineType, Address address) {

    public void showClass() {
        System.out.println("Name: " + name);
        System.out.println("Address: ");
        address.showClass();
        System.out.println("Cuisine Type: " + cuisineType);
    }

}
