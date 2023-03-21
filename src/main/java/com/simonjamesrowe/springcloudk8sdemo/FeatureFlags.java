package com.simonjamesrowe.springcloudk8sdemo;

import java.util.Map;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("feature")
@RefreshScope
@Data
public class FeatureFlags {

    private Map<String, Boolean> flags;
}
