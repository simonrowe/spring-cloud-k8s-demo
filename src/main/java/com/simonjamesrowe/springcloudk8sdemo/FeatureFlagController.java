package com.simonjamesrowe.springcloudk8sdemo;

import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FeatureFlagController {

    private final FeatureFlags featureFlags;

    @GetMapping("/api/features")
    public Map<String, Boolean> features() {
        return featureFlags.getFlags();
    }
}
