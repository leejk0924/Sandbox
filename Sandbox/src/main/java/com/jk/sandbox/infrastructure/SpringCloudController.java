package com.jk.sandbox.infrastructure;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/config")
public class SpringCloudController {
    private final ConfigService configService;

    @GetMapping(value = "/get-config")
    public Map<String, String> getConfig() {
        return configService.getConfig();
    }
}
