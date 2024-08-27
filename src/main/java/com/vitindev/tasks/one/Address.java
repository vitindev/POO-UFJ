package com.vitindev.tasks.one;

public record Address(String street, String neighborhood, String city, String state, String postalCode) {

    public void showClass() {
        System.out.println("Street: " + street);
        System.out.println("Neighborhood: " + neighborhood);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Postal Code: " + postalCode);
    }

}
