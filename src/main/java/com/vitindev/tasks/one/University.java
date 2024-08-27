package com.vitindev.tasks.one;

public record University(String name, Address address, int foundingYear) {

    public void showClass() {
        System.out.println("Name: " + name);
        System.out.println("Address: ");
        address.showClass();
        System.out.println("Founding Year: " + foundingYear);
    }

}
