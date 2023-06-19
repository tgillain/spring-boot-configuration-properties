package org.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigConfiguration {
    
    @Bean
    ConfigRepository configRepository() {
        return new ConfigRepository();
    }
    
}
