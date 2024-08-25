package com.vitindev.jobs.one.calculator;

public class StartCalculator {

    public static void main(String[] args) {

        /*
         * Criado assim já para utilizar o conceito de herança vale lembrar que os
         * metodos sum, subtract, multiply e divide são da classe `SimpleCalculator`
         */
        var calculator = new AdvancedCalculator();
        System.out.println("Soma: " + calculator.sum(1, 1));
        System.out.println("Subtração: " + calculator.subtract(2, 1));
        System.out.println("Multiplicação: " + calculator.multiply(2, 2));
        System.out.println("Divisão: " + calculator.divide(4, 2));
        System.out.println("Raiz: " + calculator.sqrt(4));
        System.out.println("Potência: " + calculator.pow(2, 2));

    }

}
