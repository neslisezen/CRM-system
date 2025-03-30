package com.neslihansezen.crm.customer.entity;

import com.neslihansezen.crm.customer.enums.CustomerType;
import jakarta.persistence.Entity;

import java.util.List;

@Entity
public class PrivateCustomer extends Customer{
    private CustomerType customerType;
    private List<Object> recommendations;
    //TODO: Connect the field named "recommendations" to the Product entity somehow(?)
}
