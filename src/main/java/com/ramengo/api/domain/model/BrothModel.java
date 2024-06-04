package com.ramengo.api.domain.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BrothModel {

    private Long id;

    private String imageInactive;

    private String imageActive;

    private String name;

    private String description;

    private Double price;
}

