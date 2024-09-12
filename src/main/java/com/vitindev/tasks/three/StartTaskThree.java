package com.vitindev.tasks.three;

import com.vitindev.tasks.three.car.Car;
import com.vitindev.tasks.three.employee.Employee;
import com.vitindev.tasks.three.employee.Manager;
import com.vitindev.tasks.three.form.Circle;
import com.vitindev.tasks.three.form.Rectangle;

import java.util.Set;

public class StartTaskThree {

    public static void main(String[] args) {

        // Atividade 1

        final var car = new Car("HB20s", 4);
        car.display();
        System.out.println();

        // Atividade 2

        final var rectangle = new Rectangle(2, 5);
        System.out.println("Área do retangulo: " + rectangle.calculateArea());

        final var circle = new Circle(5);
        System.out.println("Área do Circulo: " + circle.calculateArea());
        System.out.println();

        // Atividade 3

        final var set = Set.of(
                new Employee("Murilo Gaban", 500F),
                new Employee("Victor Hugo", 1500F),
                new Employee("Rebeca Maria Fonseca", 1500F),
                new Manager("Bruna Mota", 3500F, 1000F),
                new Manager("Fabricio Andrade", 3500F, 7000F)
        );

        set.forEach(Employee::display);

    }

}
