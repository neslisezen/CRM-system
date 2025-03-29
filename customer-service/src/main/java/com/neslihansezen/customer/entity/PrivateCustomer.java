package com.neslihansezen.customer.entity;

import com.neslihansezen.customer.enums.CustomerType;
import jakarta.persistence.Entity;

@Entity
public class PrivateCustomer extends Customer{
    private CustomerType customerType;
}
