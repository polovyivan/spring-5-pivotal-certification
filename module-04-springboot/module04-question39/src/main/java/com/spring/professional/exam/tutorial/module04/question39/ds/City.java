package com.spring.professional.exam.tutorial.module04.question39.ds;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@Builder
@AllArgsConstructor
public class City {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    public City() {
    }
}
