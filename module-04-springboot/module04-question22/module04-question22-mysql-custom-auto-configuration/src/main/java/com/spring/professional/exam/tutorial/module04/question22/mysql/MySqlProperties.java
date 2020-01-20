package com.spring.professional.exam.tutorial.module04.question22.mysql;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "mysql")
@Data
public class MySqlProperties {
    private String host;
    private int port;
    private String dbname;
    private String username;
    private String password;
}
