package com.seyda.repository.entity;

import com.seyda.utility.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
@Table(name = "tblorderdetail")
@Entity
public class OrderDetails extends BaseEntity {


    private Double amount;
    private Integer quantity;
    private Double unitPrice;
    private Double totalPrice;
    @ManyToOne
    private Order order;
    @ManyToOne
    private Product product;


}
