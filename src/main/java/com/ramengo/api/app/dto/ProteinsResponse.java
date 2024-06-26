package com.ramengo.api.app.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ProteinsResponse {

    private Long id;
    private String imageInactive;
    private String imageActive;
    private String name;
    private String description;
    private Double price;
}