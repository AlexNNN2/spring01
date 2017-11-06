package com.example.demo.models.ProductModels;

import javax.persistence.*;

@Entity
@Table(name="currencies")
public class Currencies {

    private int id;
    private String name;

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

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
