package com.vitindev.jobs.one.date;

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

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
