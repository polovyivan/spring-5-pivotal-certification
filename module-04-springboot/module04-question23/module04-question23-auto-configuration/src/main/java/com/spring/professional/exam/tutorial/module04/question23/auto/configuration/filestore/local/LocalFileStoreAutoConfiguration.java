package com.spring.professional.exam.tutorial.module04.question23.auto.configuration.filestore.local;

import com.spring.professional.exam.tutorial.module04.question23.auto.configuration.filestore.FileStore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "file.store", havingValue = "local")
public class LocalFileStoreAutoConfiguration {
    @Bean
    public FileStore fileStore() {
        return new LocalFileStore();
    }
}
