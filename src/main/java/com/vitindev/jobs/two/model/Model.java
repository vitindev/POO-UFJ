package com.vitindev.jobs.two.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public final class Model {

    private Work work;
    private int code, edition, year;

}
