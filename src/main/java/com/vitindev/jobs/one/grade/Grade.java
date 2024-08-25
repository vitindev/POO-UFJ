package com.vitindev.jobs.one.grade;

public class Grade {

    private double testOne, testTwo;
    private double taskOne, taskTwo, taskThree, taskFour;

    public double calculatorFinalResult() {
        return (((taskOne + taskTwo + testOne) / 3.0D) + ((taskThree + taskFour + testTwo) / 3.0D)) / 2.0D;
    }

    public double getTestOne() {
        return testOne;
    }

    public void setTestOne(double testOne) {
        this.testOne = testOne;
    }

    public double getTestTwo() {
        return testTwo;
    }

    public void setTestTwo(double testTwo) {
        this.testTwo = testTwo;
    }

    public double getTaskTwo() {
        return taskTwo;
    }

    public void setTaskTwo(double taskTwo) {
        this.taskTwo = taskTwo;
    }

    public double getTaskOne() {
        return taskOne;
    }

    public void setTaskOne(double taskOne) {
        this.taskOne = taskOne;
    }

    public double getTaskThree() {
        return taskThree;
    }

    public void setTaskThree(double taskThree) {
        this.taskThree = taskThree;
    }

    public double getTaskFour() {
        return taskFour;
    }

    public void setTaskFour(double taskFour) {
        this.taskFour = taskFour;
    }
}
