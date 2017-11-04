package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotNull
    @Column(name = "name")
    private String name;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="price_id")
    private Price_product price_product;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="category_id")
    private CategoryProduct categoryProduct;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="status_id")
    private Status_product status_product;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Price_product getPrice_product() {
        return price_product;
    }

    public void setPrice_product(Price_product price_product) {
        this.price_product = price_product;
    }

    public CategoryProduct getCategory_product() {
        return categoryProduct;
    }

    public void setCategory_product(CategoryProduct category_product) {
        this.categoryProduct = category_product;
    }

    public Status_product getStatus_product() {
        return status_product;
    }

    public void setStatus_product(Status_product status_product) {
        this.status_product = status_product;
    }
}
