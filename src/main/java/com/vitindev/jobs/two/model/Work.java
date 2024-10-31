package com.vitindev.jobs.two.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@Data
@ToString
public class Work {

    private final int code;

    private String title;
    private Author author;
    private Publisher publisher;

}
