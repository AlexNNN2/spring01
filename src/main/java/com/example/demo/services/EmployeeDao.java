package com.example.demo.services;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.demo.models.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class EmployeeDao {

    public void create(Employee employee) {
        entityManager.persist(employee);
        return;
    }

    public void delete(Employee employee) {
        if (entityManager.contains(employee))
            entityManager.remove(employee);
        else
            entityManager.remove(entityManager.merge(employee));
        return;
    }

    @SuppressWarnings("unchecked")
    public List<Employee> getAll() {
        return entityManager.createQuery("from Employee").getResultList();
    }

    public Employee getByEmail(String email) {
        return (Employee) entityManager.createQuery(
                "from Employee where email = :email")
                .setParameter("email", email)
                .getSingleResult();
    }

    public Employee getById(int id) {
        return entityManager.find(Employee.class, id);
    }

    public void update(Employee employee) {
        entityManager.merge(employee);
        return;
    }

    @PersistenceContext
    private EntityManager entityManager;

}
