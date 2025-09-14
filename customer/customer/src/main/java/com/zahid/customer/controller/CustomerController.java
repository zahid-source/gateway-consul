package com.zahid.customer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CustomerController {

    @GetMapping("/hello")
    public Map<String, String> hello() {
        return Map.of("message", "Hello from customer");
    }

    @GetMapping("/actuator/health")
    public Map<String, String> health() {
        return Map.of("status", "UP");
    }
}
