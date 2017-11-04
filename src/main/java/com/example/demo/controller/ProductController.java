package com.example.demo.controller;


import com.example.demo.models.Product;
import com.example.demo.services.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class ProductController {
    @Autowired
    private ProductDao productDao;

    @RequestMapping(method = RequestMethod.GET, value = "product/{id}")
    @ResponseBody
    public Product getById (@PathVariable ("id") int id){
        Product product = productDao.getById(id);
        System.out.println(product);
        return product;
    }

    @RequestMapping(value="/product/get_all")
    @ResponseBody
    public List<Product> getAll () {
        List<Product> users = productDao.getAll();
        for (Product s : users){
            System.out.println(s.getId()+" "+s.getName()+" "+s.getCategory()+" "+s.getStatus());
        }
        return users;
    }


}
