package com.seyda.repository.entity;

import com.seyda.utility.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Table(name = "tblCart")
@Entity
public class Cart extends BaseEntity {


    @OneToOne
    private Customer customer;
    @OneToMany(mappedBy = "cart")
    private List<Order> orderlist;

}
