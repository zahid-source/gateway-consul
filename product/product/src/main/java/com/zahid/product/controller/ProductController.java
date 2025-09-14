package com.zahid.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ProductController {

    @GetMapping("/hello")
    public Map<String, String> hello() {
        return Map.of("message", "Hello from product");
    }

    @GetMapping("/actuator/health")
    public Map<String, String> health() {
        return Map.of("status", "UP");
    }
}
