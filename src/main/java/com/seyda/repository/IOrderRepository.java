package com.seyda.repository;

import com.seyda.repository.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepository extends JpaRepository<Order, Long> {
    @Query("UPDATE Order o SET o.totalPrice = :totalPrice WHERE o.id = :orderId")
    void updateOrderTotalPrice(@Param("orderId") Long orderId, @Param("totalPrice") double totalPrice);
}
