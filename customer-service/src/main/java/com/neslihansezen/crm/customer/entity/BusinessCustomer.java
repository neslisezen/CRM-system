package com.neslihansezen.crm.customer.entity;

import com.neslihansezen.crm.customer.enums.CustomerLevel;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class BusinessCustomer extends Customer{
    private String organizationName;

    @Enumerated(EnumType.STRING)
    private CustomerLevel customerLevel;

    @OneToMany
    private List<BusinessCustomer> parentOrganization;
}
