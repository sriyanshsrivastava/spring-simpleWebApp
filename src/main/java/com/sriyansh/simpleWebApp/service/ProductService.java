package com.sriyansh.simpleWebApp.service;

import java.util.Arrays;
import java.util.List;
import com.sriyansh.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    List<Product> products = Arrays.asList(
            new Product(101,"Iphone",50000),
            new Product(102,"Cannon Camera",70000),
            new Product(103,"Shure Mic",10000));

    public List<Product> getProducts(){
        return products;
    }
}
