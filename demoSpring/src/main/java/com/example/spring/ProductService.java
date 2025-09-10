package com.example.spring;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>();

    public ProductService() {
    
        products.add(new Product(1, "Laptop", 80000));
        products.add(new Product(2, "Smartphone", 50000));
        
    }

    public List<Product> getAllProducts() {

        return products;
    }
}
