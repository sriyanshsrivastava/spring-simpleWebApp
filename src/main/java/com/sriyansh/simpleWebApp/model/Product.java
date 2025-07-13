package com.sriyansh.simpleWebApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    int productId;
    String productName;
    int productPrice;

// These constructors are not required because we are using Lombok here It will handle all the constructors automatically

//    public Product(int productId) {
//    }
//
//    public Product(int productId, String productName, int productPrice) {
//        this.productId = productId;
//        this.productName = productName;
//        this.productPrice = productPrice;
//    }
}
