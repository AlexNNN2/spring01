package com.example.demo.controller;

import com.example.demo.models.Groop;
import com.example.demo.services.GroopDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class GroopController {
    @Autowired
    private GroopDao groopDao;

    @RequestMapping(method = RequestMethod.GET, value = "/groop/{id}")
    @ResponseBody
    public Groop getById(@PathVariable("id") int id){
        System.out.println(groopDao.getById(id));
        return groopDao.getById(id);
    }
}
