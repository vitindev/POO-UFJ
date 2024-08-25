package com.vitindev.jobs.one.address;

import com.vitindev.jobs.one.date.BasicDate;

public class StartUser {

    public static void main(String[] args) {

        final var user = new User("Victor Hugo", new BasicDate(28, 8, 2002));

        user.setAddress("Rua Cherafim de Carvalho, 2876, Vila Jataí Maria, Jataí-GO");
        user.setMail("vitin@gmail.com");
        user.setPhone("(64) 9 9999-9999");

        System.out.println("Nome: " + user.getName());
        System.out.println("Email: " + user.getMail());
        System.out.println("Telefone: " + user.getPhone());
        System.out.println("Data de Aniversário: " + user.getBirthdate().formatDate());

    }

}
