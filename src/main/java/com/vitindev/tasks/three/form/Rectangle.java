package com.vitindev.tasks.three.form;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Rectangle extends Form {

    private final double base, height;

    @Override
    public double calculateArea() {
        return base * height;
    }

}
