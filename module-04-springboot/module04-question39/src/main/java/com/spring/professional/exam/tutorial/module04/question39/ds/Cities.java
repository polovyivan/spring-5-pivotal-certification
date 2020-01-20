package com.spring.professional.exam.tutorial.module04.question39.ds;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cities {
    private Iterable<City> cities;

    public Cities() {
    }
}
