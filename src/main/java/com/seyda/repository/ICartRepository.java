package com.seyda.repository;

import com.seyda.repository.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ICartRepository extends JpaRepository<Cart, Long> {
    @Query("UPDATE Cart c SET c.totalPrice = :totalPrice WHERE c.id = :cartId")
    void updateCartTotalPrice(@Param("cartId") Long cartId, @Param("totalPrice") double totalPrice);
}
