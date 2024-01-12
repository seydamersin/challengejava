package com.seyda.controller;

import com.seyda.dto.request.ProductSaveRequestDto;
import com.seyda.dto.response.GetProductResponseDto;
import com.seyda.repository.entity.Product;
import com.seyda.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

import static com.seyda.constant.RestApi.*;

@RestController
@RequestMapping(PRODUCT)
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping(SAVE)
    public ResponseEntity<Void> save(ProductSaveRequestDto dto){
        productService.saveDto(dto);
        return ResponseEntity.ok().build();
    }


    @PutMapping(UPDATE)
    public ResponseEntity <GetProductResponseDto >updateCompany(@RequestBody ProductSaveRequestDto dto) {
        return ResponseEntity.ok(new GetProductResponseDto(productService.update(new Product())));
    }







}
