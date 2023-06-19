package org.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
public class ConnectorProperties {

    @Value("${graceful-shutdown-period:60}")
    private long gracefulShutdownPeriod;

    private ConfigRepository configConfiguration;

    public ConnectorProperties(ConfigRepository configConfiguration) {
        assert configConfiguration!=null : "Received null configuration";
        this.configConfiguration = configConfiguration;
    }
    
    public String getParam() {
        return configConfiguration.getParam();
    }

}
