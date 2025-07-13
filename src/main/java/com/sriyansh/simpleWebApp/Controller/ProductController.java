package com.sriyansh.simpleWebApp.Controller;

import com.sriyansh.simpleWebApp.model.Product;
import com.sriyansh.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;

    @RequestMapping("/products")
    public List<Product> getProduct(){
        return service.getProducts();
    }

}
