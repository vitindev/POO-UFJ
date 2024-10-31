package com.vitindev.jobs.two.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@Data
@ToString
public class Publisher {

    private final int code;

    private String name;
    private String address;

}
