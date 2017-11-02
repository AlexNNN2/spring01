package com.example.demo.services;

import com.example.demo.models.Employee;
import com.example.demo.models.Groop;
import com.example.demo.models.Status;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class StatusDao {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Status> getAll (){
        return entityManager.createQuery("from Status").getResultList();
    }

    public Status getById (int id){
        return entityManager.find(Status.class, id);
    }

    public List<Employee> getUsersById (int statusId){
        Status status = getById(statusId);
        return null;
    }


}
