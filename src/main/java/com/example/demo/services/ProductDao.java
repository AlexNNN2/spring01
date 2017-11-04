package com.example.demo.services;

import com.example.demo.models.Product;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class ProductDao {
    @PersistenceContext
    private EntityManager entityManager;

    public Product getById (int id){
        return entityManager.find(Product.class, id);
    }

    public List<Product> getAll (){
    return entityManager.createQuery("from Product").getResultList();
}
}
