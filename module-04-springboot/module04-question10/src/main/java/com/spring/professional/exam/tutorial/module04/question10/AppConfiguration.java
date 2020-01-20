package com.spring.professional.exam.tutorial.module04.question10;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app")
@Getter
@Setter
public class AppConfiguration {
    private String propertyA;
}
