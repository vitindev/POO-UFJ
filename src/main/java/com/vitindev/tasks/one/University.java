package com.vitindev.tasks.one;

public class University {

    private final String name;
    private final Address address;
    private final int foundingYear;

    public University(String name, Address address, int foundingYear) {
        this.name = name;
        this.address = address;
        this.foundingYear = foundingYear;
    }

    public int getFoundingYear() {
        return foundingYear;
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void showClass() {
        System.out.println("Name: " + name);
        System.out.println("Address: ");
        address.showClass();
        System.out.println("Founding Year: " + foundingYear);
    }

}
