package com.vitindev.jobs.one.grade;

public class StartGrade {

    public static void main(String[] args) {

        final var grade = new Grade();
        grade.setTaskOne(6.0D);
        grade.setTaskTwo(5.0D);
        grade.setTaskThree(9.0D);
        grade.setTaskFour(3.0D);
        grade.setTestOne(7.0D);
        grade.setTestTwo(8.0D);

        final var result = grade.calculatorFinalResult();
        final var formatResult = String.format("%.1f", result);

        if (result >= 6.0D) {
            System.out.println("Aluno `Aprovado` com média: " + formatResult);
        } else {
            System.out.println("Aluno `Reprovado` com média: " + formatResult);
        }

    }

}
