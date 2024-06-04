package com.ramengo.api.infra.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "caldo_entity")
public class BrothEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String imageInactive;
    @Column
    private String imageActive;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private Double price;
}

