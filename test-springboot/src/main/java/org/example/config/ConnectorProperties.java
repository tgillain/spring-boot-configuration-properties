package org.example.config;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

import jakarta.annotation.PostConstruct;

import static org.slf4j.LoggerFactory.*;

@ConfigurationProperties
public class ConnectorProperties {

    private static final Logger LOGGER = getLogger(ConnectorProperties.class);

    @Value("${graceful-shutdown-period:60}")
    private long gracefulShutdownPeriod;

    @Autowired
    private ConfigRepository configConfiguration;

    public ConnectorProperties(ConfigRepository configConfiguration) {
        this.configConfiguration = configConfiguration;
    }
    
    @PostConstruct
    void init() {
        LOGGER.info("Param value: {}",configConfiguration.getParam());
    }
    
    public String getParam() {
        return configConfiguration.getParam();
    }

}
