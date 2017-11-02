package com.example.demo.controller;

import com.example.demo.models.Employee;
import com.example.demo.services.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {

    @RequestMapping(value = "/test", method = RequestMethod.GET, headers = "Accept=*/*")
    public String getQuery() {
        System.out.println("Good test");
        return "Test !!!1";
    }

    @RequestMapping(value="/create")
    @ResponseBody
    public String create(String name) {
        try {
            Employee employee = new Employee();
            employeeDao.create(employee);
        }
        catch (Exception ex) {
            return "Error creating the user: " + ex.toString();
        }
        return "Employee succesfully created!";
    }

    @RequestMapping(value="/get_all")
    @ResponseBody
    public List<Employee> getAll () {
        List<Employee> users = employeeDao.getAll();
        for (Employee s : users){
            System.out.println(s.getId()+" "+s.getName()+" "+s.getLastName());
        }
        return users;
    }

    @RequestMapping(value="/delete")
    @ResponseBody
    public String delete(int id) {
        try {
            Employee employee = new Employee();
            employeeDao.delete(employee);
        }
        catch (Exception ex) {
            return "Error deleting the user: " + ex.toString();
        }
        return "Employee succesfully deleted!";
    }

    @RequestMapping(value="/get-by-email")
    @ResponseBody
    public String getByEmail(String email) {
        String userId;
        try {
            Employee employee = employeeDao.getByEmail(email);
            userId = String.valueOf(employee.getId());
        }
        catch (Exception ex) {
            return "Employee not found: " + ex.toString();
        }
        return "The user id is: " + userId;
    }

    @RequestMapping(value="/user/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Employee getById (@PathVariable int id){
        System.out.println(employeeDao.getById(id).toString());
        Employee em = employeeDao.getById(id);
        return em;
    }

    @RequestMapping(value="/update")
    @ResponseBody
    public String updateName(int id, String email, String name) {
        try {
            Employee employee = employeeDao.getById(id);
            employee.setName(name);
            employeeDao.update(employee);
        }
        catch (Exception ex) {
            return "Error updating the user: " + ex.toString();
        }
        return "Employee succesfully updated!";
    }

    @Autowired
    private EmployeeDao employeeDao;

}


