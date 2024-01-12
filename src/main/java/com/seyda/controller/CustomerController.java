package com.seyda.controller;

import com.seyda.dto.request.CustomerSaveRequestDto;
import com.seyda.repository.entity.Customer;
import com.seyda.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.seyda.constant.RestApi.*;

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


}
