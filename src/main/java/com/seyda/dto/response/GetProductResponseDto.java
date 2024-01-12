package com.seyda.dto.response;

import com.seyda.repository.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class GetProductResponseDto {
    private Long id;
    private String productName;

    private Double price;
    private Integer stock;

    public GetProductResponseDto(Product product) {
        this.id = product.getId();
        this.productName = product.getProductName();
        this.price = product.getPrice();
        this.stock = product.getStock();
    }
}
