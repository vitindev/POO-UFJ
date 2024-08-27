package com.vitindev.jobs.one.grade;

import lombok.Data;

@Data
public class Grade {

    private double testOne, testTwo;
    private double taskOne, taskTwo, taskThree, taskFour;

    public double calculatorFinalResult() {
        return (((taskOne + taskTwo + testOne) / 3.0D) + ((taskThree + taskFour + testTwo) / 3.0D)) / 2.0D;
    }

}
