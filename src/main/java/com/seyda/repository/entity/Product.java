package com.seyda.repository.entity;

import com.seyda.utility.BaseEntity;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Table(name = "tblProduct")
@Entity
public class Product extends BaseEntity {



    @NotNull
    @Basic(optional = false)
    private String productName;

    private Double price;
    private Integer stock;
    @OneToMany(mappedBy = "product")
    private List<OrderDetails> orderDetails;

}
