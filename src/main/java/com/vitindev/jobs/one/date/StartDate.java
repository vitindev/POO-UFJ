package com.vitindev.jobs.one.date;

public class StartDate {

    public static void main(String[] args) {

        final var basicDate = new BasicDate(24, 6, 2022);
        basicDate.showDate();

        basicDate.setYear(2024);
        basicDate.setMonth(8);

        basicDate.showDate();
    }

}
