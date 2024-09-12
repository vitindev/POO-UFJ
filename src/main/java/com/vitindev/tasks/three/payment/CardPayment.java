package com.vitindev.tasks.three.payment;

import lombok.Getter;

@Getter
public class CardPayment extends Payment {

    private final String cardNumber;

    public CardPayment(double value, String cardNumber) {
        super(value);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("O pagamento foi processado com Cartão!");
    }

    @Override
    public void displayValue() {
        System.out.println("Número do Cartão: " + cardNumber);
        super.displayValue();
    }

}
