package com.ramengo.api.app.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderRequest {
    @NotBlank(message = "both brothId and proteinId are required")
    private String brothId;
    @NotBlank(message = "both brothId and proteinId are required")
    private String proteinId;
}
