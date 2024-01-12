package com.seyda.service;
import com.seyda.dto.request.CartAddToCartRequestDto;
import com.seyda.dto.request.CustomerSaveRequestDto;
import com.seyda.mapper.ICartMapper;
import com.seyda.mapper.ICustomerMapper;
import com.seyda.repository.ICartRepository;
import com.seyda.repository.IProductRepository;
import com.seyda.repository.entity.Cart;
import com.seyda.repository.entity.Customer;
import com.seyda.repository.entity.OrderDetails;
import com.seyda.repository.entity.Product;
import com.seyda.utility.ServiceManager;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CartService extends ServiceManager<Cart , Long>{
    private final ICartRepository cartRepository;

    private final IProductRepository productRepository;

    private final ProductService productService;
    public CartService(ICartRepository cartRepository, IProductRepository productRepository, ProductService productService) {
        super(cartRepository);

        this.cartRepository = cartRepository;
        this.productRepository=productRepository;
        this.productService = productService;
    }

    public void addToCartDto(CartAddToCartRequestDto dto) {
        Long cartId = dto.getCartId();
        Long productId = dto.getProductId();
        int quantity = dto.getQuantity();

        Cart cart = findById(cartId).orElseThrow(() -> new RuntimeException("Cart not found"));

        Product product = productService.findById(productId).orElseThrow(() -> new RuntimeException("Product not found"));

        // Stok kontrolü ekleyebilirsiniz
        if (product.getStock() < quantity) {
            throw new ArrayStoreException("ürün stokta yok: " + productId); // bu hatayı öylesine yazdım özelleştiricem stokta yoksa hata fırlat

        }


        updateCartTotalPriceAndSave(ICartMapper.INSTANCE.toCart(dto));


    }

    private void updateCartTotalPriceAndSave(Cart cart) {
        double totalPrice = calculateCartTotalPrice(cart);

        cart.setTotalPrice(totalPrice);

        save(cart);
    }

    // Sepetin toplam fiyatını hesapla
    private double calculateCartTotalPrice(Cart cart) {
        return cart.getOrderDetails().stream()
                .mapToDouble(OrderDetails::getTotalPrice)
                .sum();
    }




}
