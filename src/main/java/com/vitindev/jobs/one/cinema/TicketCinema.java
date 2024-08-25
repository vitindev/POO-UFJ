package com.vitindev.jobs.one.cinema;

import com.vitindev.jobs.one.date.BasicDate;

public class TicketCinema {

    private final String name;
    private final BasicDate sessionDate;

    private double price;
    private int sessionHour, roomId;

    public TicketCinema(String name, BasicDate sessionDate) {
        this.name = name;
        this.sessionDate = sessionDate;
    }

    public double calculateDiscount(BasicDate clientDate) {
        return calculateDiscount(clientDate, 0);
    }

    public double calculateDiscount(BasicDate clientDate, int studentCardId) {

        var percentDiscount = 0.0D;
        final var isStudent = studentCardId > 0;
        final var age = sessionDate.getYear() - clientDate.getYear();

        if (age < 12) {
            percentDiscount = 50.0D;
        } else if (isStudent) {

            if (age <= 15) {
                percentDiscount = 40.0D;
            } else if (age <= 20) {
                percentDiscount = 30.0D;
            } else {
                percentDiscount = 20.0D;
            }

        }

        return percentDiscount > 0 ? (price * percentDiscount) / 100 : 0.0D;
    }

    public double calculateDiscountHour() {
        return sessionHour < 16 ? (price * 10) / 100 : 0.0D;
    }

    public String getName() {
        return name;
    }

    public BasicDate getSessionDate() {
        return sessionDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSessionHour() {
        return sessionHour;
    }

    public void setSessionHour(int sessionHour) {
        this.sessionHour = sessionHour;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    @Override
    public String toString() {
        return "TicketCinema{" +
                "name='" + name + '\'' +
                ", sessionDate=" + sessionDate.formatDate() +
                ", price=" + price +
                ", sessionHour=" + sessionHour +
                ", roomId=" + roomId +
                '}';
    }
}
