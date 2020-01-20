package com.spring.professional.exam.tutorial.module04.question42.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Builder
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    public Employee(String name, City city) {
        this.name = name;
        this.city = city;
    }

    @SuppressWarnings("unused")
    public Employee() {
    }
}
