package com.neslihansezen.crm.customer.entity;

import com.neslihansezen.crm.customer.enums.RoleType;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class CustomerRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private RoleType roleType;
    private LocalDate startDate;
    private LocalDate endDate;

    @ManyToOne
    @JoinColumn
    private Customer customer;
}
