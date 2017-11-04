package com.example.demo.controller;

import com.example.demo.models.Status;
import com.example.demo.services.StatusDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StatusController {
    @Autowired
    StatusDao statusDao;

    @RequestMapping(method = RequestMethod.GET, value = "/status/{id}")
    @ResponseBody
    public Status getById (@PathVariable("id") int id){
        return statusDao.getById(id);
    }

    @RequestMapping(value="/status/get_all")
    @ResponseBody
    public List<Status> getAll () {
        List<Status> users = statusDao.getAll();
        return users;
    }
}
