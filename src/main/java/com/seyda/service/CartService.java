package com.seyda.service;
import com.seyda.repository.ICartRepository;
import com.seyda.repository.IProductRepository;
import com.seyda.repository.entity.Cart;
import com.seyda.repository.entity.Customer;
import com.seyda.repository.entity.Product;
import com.seyda.utility.ServiceManager;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CartService extends ServiceManager<Cart , Long>{
    private final ICartRepository cartRepository;

    private final IProductRepository productRepository;
    public CartService(ICartRepository cartRepository,IProductRepository productRepository) {
        super(cartRepository);

        this.cartRepository = cartRepository;
        this.productRepository=productRepository;
    }



}
