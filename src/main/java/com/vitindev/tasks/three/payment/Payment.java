package com.vitindev.tasks.three.payment;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public abstract class Payment {

    private final double value;

    public abstract void processPayment();

    public void displayValue() {
        System.out.println("Valor: " + value);
    }

}
