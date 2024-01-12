package com.seyda.repository.entity;

import com.seyda.utility.BaseEntity;
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
@Table(name = "tblCustomer")
@Entity
public class Customer extends BaseEntity {



    String name;
    String lastname;
    String phoneNumber;
    String mail;
    String address;

    @OneToOne
    private Cart cart;
    @OneToMany(mappedBy = "customer")
    private List<Order> orders;


}
