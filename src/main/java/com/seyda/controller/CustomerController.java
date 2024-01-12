package com.seyda.controller;

import com.seyda.dto.request.CustomerSaveRequestDto;
import com.seyda.dto.response.CustomerFindAllResponseDto;
import com.seyda.repository.entity.Customer;
import com.seyda.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.seyda.constant.RestApi.*;
// localhost:9090/v1/dev/customer
@RestController
@RequestMapping(CUSTOMER)
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping(SAVE)
    public ResponseEntity<String> save(@RequestBody CustomerSaveRequestDto dto){

      customerService.saveDto(dto);
        return ResponseEntity.ok("Ok.");
    }


    @GetMapping(FINDALL)
    public ResponseEntity<List<CustomerFindAllResponseDto>> findAll(){
        return ResponseEntity.ok(customerService.findAllResponseDtos());
    }
}
