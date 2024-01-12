package com.seyda.service;

import com.seyda.dto.request.CustomerSaveRequestDto;
import com.seyda.mapper.ICustomerMapper;
import com.seyda.repository.ICustomerRepository;
import com.seyda.repository.entity.Customer;
import com.seyda.utility.ServiceManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class CustomerService extends ServiceManager<Customer,Long> {

private final ICustomerRepository customerRepository;

    public CustomerService(ICustomerRepository customerRepository) {
        super(customerRepository);
        this.customerRepository = customerRepository;
    }


    public void saveDto(CustomerSaveRequestDto dto){
//      Customer customer = Customer.builder()
//              .name(dto.getName())
 //             .address(dto.getAddress())
//              .phoneNumber(dto.getPhoneNumber())
//              .mail(dto.getMail())
//              .build();
//      save(customer);
        save(ICustomerMapper.INSTANCE.toCustomer(dto));
    }

}
