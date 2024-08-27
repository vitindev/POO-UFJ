package com.vitindev.jobs.one.date;

import lombok.Data;

@Data
public class BasicDate {

    private int day, month, year;

    public BasicDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void showDate() {
        System.out.printf("%02d/%02d/%04d%n", day, month, year);
    }

    public String formatDate() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }

}
