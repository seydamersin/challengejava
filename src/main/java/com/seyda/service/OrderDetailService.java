package com.seyda.service;

import com.seyda.repository.ICartRepository;
import com.seyda.repository.IOrderDetailRepository;
import com.seyda.repository.entity.Cart;
import com.seyda.repository.entity.OrderDetails;
import com.seyda.repository.entity.Product;
import com.seyda.utility.ServiceManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailService extends ServiceManager<OrderDetails, Long> {
    private final IOrderDetailRepository orderDetailRepository;
private  final ICartRepository cartRepository;
    public OrderDetailService(IOrderDetailRepository orderDetailRepository, ICartRepository cartRepository) {
        super(orderDetailRepository);
        this.orderDetailRepository = orderDetailRepository;
        this.cartRepository = cartRepository;
    }



}
