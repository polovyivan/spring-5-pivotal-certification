package com.spring.professional.exam.tutorial.module04.question06.java.properties.configuration;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "app")
@Getter
@Setter
@ToString
public class ApplicationConfiguration {
    private String name;
    private String description;
    private List<String> servers;
    private Map<String, EnvironmentConfiguration> environments;
}
