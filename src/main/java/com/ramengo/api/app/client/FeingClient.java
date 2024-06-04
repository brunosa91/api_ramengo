package com.ramengo.api.app.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Map;

@Component
@FeignClient(name = "orderClient", url = "https://api.tech.redventures.com.br/orders")
public interface FeingClient {
        @PostMapping("/generate-id")
        ResponseEntity<Map<String, String>> generateOrderId(@RequestHeader("x-api-key") String apiKey);    }
