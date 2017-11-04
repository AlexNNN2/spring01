package com.example.demo.models.ProductModels;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="currencies")
public class Currencies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @NotNull
    @Column(name="name")
    private String name;

/*    @JsonManagedReference
    @OneToMany(mappedBy = "price", fetch = FetchType.EAGER)
    private List<Price> prices;*/

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

/*    public List<Price> getPrices() {
        return prices;
    }

    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }*/
}
