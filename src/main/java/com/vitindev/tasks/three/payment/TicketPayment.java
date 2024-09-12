package com.vitindev.tasks.three.payment;

import lombok.Getter;

@Getter
public class TicketPayment extends Payment {

    private final String code;

    public TicketPayment(double value, String code) {
        super(value);
        this.code = code;
    }

    @Override
    public void processPayment() {
        System.out.println("O pagamento foi processado com Boleto!");
    }

    @Override
    public void displayValue() {
        System.out.println("Código do Boleto: " + code);
        super.displayValue();
    }

}
