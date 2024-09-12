package com.vitindev.tasks.three.form;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Circle extends Form {

    private final double radius;

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

}
