package com.ramengo.api.app.service;


import com.ramengo.api.app.client.FeingClient;
import com.ramengo.api.app.dto.OrderReponse;
import com.ramengo.api.app.dto.OrderRequest;
import com.ramengo.api.app.exception_handler.exception.ServerError;
import com.ramengo.api.app.mapper.Mapper;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class OrderService {


    @Autowired
    private FeingClient orderClient;

    @Autowired
    private Mapper mapper;
    @Autowired
    private HttpServletRequest request;

    public OrderReponse insert(OrderRequest orderRequest) {
            String authorizationHeader = request.getHeader("x-api-key");

            ResponseEntity<Map<String, String>> response = orderClient.generateOrderId(authorizationHeader);
            if (response.getStatusCode().is2xxSuccessful()) {
                OrderReponse orderReponse = mapper.requestToResponse(orderRequest);
                String orderId = response.getBody().get("orderId");
                orderReponse.setId(orderId);
                orderReponse.setDescription("Salt and Chasu Ramen");
                orderReponse.setImage("https://tech.redventures.com.br/icons/pork/active.svg");
                return orderReponse;
            } else {
                throw new ServerError();
            }


    }

}
