package com.seyda.service;

import com.seyda.dto.request.ProductSaveRequestDto;
import com.seyda.mapper.IProductMapper;
import com.seyda.repository.IProductRepository;
import com.seyda.repository.entity.Product;
import com.seyda.utility.ServiceManager;
import org.springframework.stereotype.Service;


@Service
public class ProductService extends ServiceManager<Product, Long> {
    private final IProductRepository productRepository;

    public ProductService(IProductRepository productRepository) {
        super(productRepository);
        this.productRepository = productRepository;
    }


    public void saveDto(ProductSaveRequestDto dto) {

        save(IProductMapper.INSTANCE.toProduct(dto));
    }



}
