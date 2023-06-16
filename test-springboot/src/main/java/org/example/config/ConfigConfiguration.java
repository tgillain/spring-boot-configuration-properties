package org.example.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigConfiguration {
    
    public String getParam() {
        return "fakeParamValue";
    }
    
}
