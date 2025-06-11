package com.jk.sandbox.infrastructure;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RefreshScope
public class ConfigService {
    @Value("${mysql.username}")
    private String username;
    @Value("${mysql.password}")
    private String password;

    public Map<String, String> getConfig() {
        return Map.of(
                "username", username,
                "password", password
        );
    }
}
