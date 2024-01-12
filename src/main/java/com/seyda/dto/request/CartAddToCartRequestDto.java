package com.seyda.dto.request;

import lombok.*;



@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CartAddToCartRequestDto {



    Long cartId ;
    Long productId ;
    int quantity ;

}
