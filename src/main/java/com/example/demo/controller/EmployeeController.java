package com.example.demo.controller;

/**
 * Created by Dima on 27.10.2017.
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @RequestMapping(value = "/data", method = RequestMethod.GET)
    public String getQuery() {
        return "Test !!!1";
    }

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String getEmployee() {
        return "Employee 122";
    }



}


