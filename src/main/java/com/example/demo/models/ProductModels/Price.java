package com.example.demo.models.ProductModels;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name="price_product")
public class Price {

    private int id;
    private String name;
    private Product product;
    private Currencies currencies;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int getId() {
        return id;
    }

    @Column(name="price")
    public String getName() {
        return name;
    }

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="product_id")
    public Product getProduct() {
        return product;
    }

    @JsonBackReference
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="currencie_id")
    public Currencies getCurrencies() {
        return currencies;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setCurrencies(Currencies currencies) {
        this.currencies = currencies;
    }
}
