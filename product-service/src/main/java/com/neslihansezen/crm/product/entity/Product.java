package com.neslihansezen.crm.product.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
abstract class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;
    private LocalDate publishDate;
    private String description;
}
