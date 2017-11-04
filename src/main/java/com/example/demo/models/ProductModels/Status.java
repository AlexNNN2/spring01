package com.example.demo.models.ProductModels;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="status_product")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @NotNull
    @Column(name="name")
    private String name;

/*    @JsonManagedReference
    @OneToMany(mappedBy = "status", fetch = FetchType.EAGER)
    private List<Product> products;*/

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

/*    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }*/
}
