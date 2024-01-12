package com.seyda.controller;

import com.seyda.repository.entity.Cart;
import com.seyda.repository.entity.Customer;
import com.seyda.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.seyda.constant.RestApi.CART;
import static com.seyda.constant.RestApi.SAVE;

@RestController
@RequestMapping(CART)
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;
}