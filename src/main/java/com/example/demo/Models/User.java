package com.example.demo.Models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Dima on 27.10.2017.
 */

/**
 * Represents an User for this web application.
 */
@Entity
@Table(name = "users1")
public class User {

    // ------------------------
    // PRIVATE FIELDS
    // ------------------------

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotNull
    @Column(name = "name")
    private String name;

    // ------------------------
    // PUBLIC METHODS
    // ------------------------
    public User() { }

    public User(int id) {
        this.id = id;
    }

    public User(String name) {
        this.name = name;
    }

    public long getId() {
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
} // class User

