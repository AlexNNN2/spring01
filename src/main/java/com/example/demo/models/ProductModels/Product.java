package com.example.demo.models.ProductModels;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {

    private int id;
    private String name;
    private Category category;
    private Status status;
    private List<Price> prices;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name="category_id")
    public Category getCategory() {
        return category;
    }

    @JsonManagedReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="status_id")
    public Status getStatus() {
        return status;
    }

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "product")
    public List<Price> getPrices() {
        return prices;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }
}
