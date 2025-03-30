package com.neslihansezen.crm.product.entity;

import jakarta.persistence.Entity;

import java.util.List;

@Entity
public class Book extends Product{
    private String ISBN;
    private int edition;
    private List<Object> authors;
}
