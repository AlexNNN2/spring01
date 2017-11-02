package com.example.demo.services;

import com.example.demo.models.Employee;
import com.example.demo.models.Groop;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class GroopDao {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Groop> getAll (){
        return entityManager.createQuery("from Groop").getResultList();
    }

    public Groop getById (int id){
        return entityManager.find(Groop.class, id);
    }

    public List<Employee> getUsersById (int groopId){
        Groop groop = getById(groopId);
        return null;
    }
}
