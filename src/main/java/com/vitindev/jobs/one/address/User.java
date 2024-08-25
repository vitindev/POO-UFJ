package com.vitindev.jobs.one.address;

import com.vitindev.jobs.one.date.BasicDate;

public class User {

    private final String name;

    // Aproveitei e utilizei do atividade passada para utilizar aqui também
    private final BasicDate birthdate;

    private String phone, mail, address;

    public User(String name, BasicDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public BasicDate getBirthdate() {
        return birthdate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
