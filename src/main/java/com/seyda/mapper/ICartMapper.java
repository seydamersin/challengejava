package com.seyda.mapper;

import com.seyda.dto.request.CartAddToCartRequestDto;
import com.seyda.repository.entity.Cart;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring" , unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ICartMapper {
    ICartMapper INSTANCE= Mappers.getMapper(ICartMapper.class);

    Cart toCart(CartAddToCartRequestDto dto);
}
