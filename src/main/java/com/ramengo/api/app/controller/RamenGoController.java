package com.ramengo.api.app.controller;


import com.ramengo.api.app.dto.BrothResponse;
import com.ramengo.api.app.dto.OrderReponse;
import com.ramengo.api.app.dto.OrderRequest;
import com.ramengo.api.app.dto.ProteinsResponse;
import com.ramengo.api.app.service.BrothServiceInterface;
import com.ramengo.api.app.service.OrderService;
import com.ramengo.api.app.service.ProteinsServiceInterface;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")


public class RamenGoController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private ProteinsServiceInterface proteinService;
    @Autowired
    private BrothServiceInterface brothsService;

    @GetMapping(value = "/broths")
    public ResponseEntity<List<BrothResponse>> getBroths() {
        List<BrothResponse> broths = brothsService.getAllBroth();
        return ResponseEntity.ok(broths);
    }

    @GetMapping(value = "/proteins")
    public ResponseEntity<List<ProteinsResponse>> getProteins( ) {
        List<ProteinsResponse> proteins = proteinService.getAllProteins();
        return ResponseEntity.ok(proteins);    }

    @PostMapping(value = "/order")
    public ResponseEntity<OrderReponse> createOrder(
            @Valid
            @RequestHeader(value = "x-api-key", required = false) String apiKey,
            @RequestBody OrderRequest orderRequest) {
            OrderReponse orderReponse = orderService.insert(orderRequest);

            return ResponseEntity.status(201).body(orderReponse);

    }
}

