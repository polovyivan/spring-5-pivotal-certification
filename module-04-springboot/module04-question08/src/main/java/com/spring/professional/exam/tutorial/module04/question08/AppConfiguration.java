package com.spring.professional.exam.tutorial.module04.question08;

import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app")
@Setter
@ToString
public class AppConfiguration {
    private int propertyA;
    private int propertyB;
    private int propertyC;
    private int propertyD;
    private int propertyE;
    private int propertyF;
    private int propertyG;
    private int propertyH;
    private int propertyI;
    private int propertyJ;
    private int propertyK;
    private int propertyL;
    private int propertyM;
    private int propertyN;
    private int propertyO;
    private int propertyP;
}
