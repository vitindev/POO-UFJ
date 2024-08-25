package com.vitindev.tasks.one;

public class Restaurant {

    private final String name, cuisineType;
    private final Address address;

    public Restaurant(String name, String cuisineType, Address address) {
        this.name = name;
        this.cuisineType = cuisineType;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public Address getAddress() {
        return address;
    }

    public void showClass() {
        System.out.println("Name: " + name);
        System.out.println("Address: ");
        address.showClass();
        System.out.println("Cuisine Type: " + cuisineType);
    }

}
