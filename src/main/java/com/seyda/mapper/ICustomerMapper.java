package com.seyda.mapper;

import com.seyda.dto.request.CustomerSaveRequestDto;
import com.seyda.dto.response.CustomerFindAllResponseDto;
import com.seyda.repository.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring" , unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ICustomerMapper {
    ICustomerMapper INSTANCE= Mappers.getMapper(ICustomerMapper.class);
   Customer toCustomer(final CustomerSaveRequestDto dto);
 CustomerFindAllResponseDto formCustomer(final Customer customer);



}
