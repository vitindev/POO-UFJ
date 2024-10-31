package com.vitindev.jobs.two.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@Data
@ToString
public class Author {

    private final int code;

    private String name;

}
