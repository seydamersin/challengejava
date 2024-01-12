package com.seyda.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UpdateProductResponseDto {
    private Long id;
    private String productName;

    private Double price;
    private Integer stock;
}
