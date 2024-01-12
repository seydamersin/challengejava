package com.seyda.mapper;

import com.seyda.dto.request.ProductSaveRequestDto;
import com.seyda.repository.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring" , unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IProductMapper {
    IProductMapper INSTANCE= Mappers.getMapper(IProductMapper.class);
    Product toProduct(final ProductSaveRequestDto dto);

}


