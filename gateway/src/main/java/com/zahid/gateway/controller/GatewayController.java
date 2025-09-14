package com.zahid.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GatewayController {

    @GetMapping("/hello")
    public Map<String, String> hello() {
        return Map.of("message", "Hello from gateway");
    }

    @GetMapping("/actuator/health")
    public Map<String, String> health() {
        return Map.of("status", "UP");
    }
}
