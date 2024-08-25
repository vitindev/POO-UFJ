package com.vitindev.tasks.one;

public class StartTaskOne {

    public static void main(String[] args) {

        final var car = new Car(2021, "Corolla", "Toyota", "ABC-1234");
        car.showClass();

        System.out.println();
        System.out.println();

        final var universityAddress = new Address("Rua São Sebastião", "Jardim São José", "Jataí", "Goiás", "75801-030");

        final var university = new University("Universidade Federal de Jataí", universityAddress, 2000);
        university.showClass();

        System.out.println();
        System.out.println();

        final var restaurantAddress = new Address("SRTVS 701/901 Bloco J", "Asa Sul", "Brasília", "Distrito Federal", "70340-500");

        final var restaurant = new Restaurant("Coco Bambu", "Brasileira com foco em Frutos do Mar", restaurantAddress);
        restaurant.showClass();

    }

}
