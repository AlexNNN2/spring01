package com.example.demo.models.ProductModels;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="status_product")
public class Status {

    private int id;
    private String name;
    private List<Product> products;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int getId() {
        return id;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }

    @JsonBackReference
    @OneToMany(mappedBy = "status", fetch = FetchType.EAGER)
    public List<Product> getProducts() {
        return products;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
