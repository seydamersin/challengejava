package com.seyda.repository.entity;

import com.seyda.utility.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Table(name = "tblCart")
@Entity
public class Cart extends BaseEntity {

    private double totalPrice;
    @OneToOne
    private Customer customer;
    @OneToMany(mappedBy = "cart", fetch = FetchType.EAGER)
    private List<Order> orderlist=new ArrayList<>();
    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
    private List<OrderDetails> orderDetails;

}
