package com.vitindev.jobs.one.cinema;

import com.vitindev.jobs.one.date.BasicDate;

public class StartCinema {

    public static void main(String[] args) {

        final var ticket = new TicketCinema("Velozes e Furiosos 2", new BasicDate(28, 8, 2024));
        ticket.setPrice(24);
        ticket.setRoomId(1);
        ticket.setSessionHour(12);

        var price = ticket.getPrice();

        // Dado do cliente
        final var clientDate = new BasicDate(28, 8, 2002);

        // Começando a calcular os descontos
        final var discountHour = ticket.calculateDiscountHour();

        if (discountHour > 0) {
            price -= discountHour;
            System.out.println("Aplicado valor de desconto em horario de sessão: " + discountHour);
        }

        final var discountDefault = ticket.calculateDiscount(clientDate, 100);

        if (discountDefault > 0) {
            price -= discountDefault;
            System.out.println("Aplicado valor de desconto padrão: " + discountDefault);
        }

        System.out.println("Preço final: " + price);
        System.out.println(ticket);
    }

}
