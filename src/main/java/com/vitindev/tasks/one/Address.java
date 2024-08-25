package com.vitindev.tasks.one;

public class Address {

    private final String street, neighborhood, city, state, postalCode;

    public Address(String street, String neighborhood, String city, String state, String postalCode) {
        this.street = street;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void showClass() {
        System.out.println("Street: " + street);
        System.out.println("Neighborhood: " + neighborhood);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Postal Code: " + postalCode);
    }

}
