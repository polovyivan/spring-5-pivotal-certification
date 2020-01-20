package com.spring.professional.exam.tutorial.module04.question36.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class OutOfServiceHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        return Health.outOfService()
                .build();
    }
}
