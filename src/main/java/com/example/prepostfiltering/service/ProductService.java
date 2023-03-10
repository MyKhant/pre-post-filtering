package com.example.prepostfiltering.service;

import com.example.prepostfiltering.ds.Product;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreFilter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @PreFilter("filterObject.owner == authentication.name")
    public List<Product> sellProducts (List<Product> products){
        return products;
    }

    @PostFilter("filterObject.owner == authentication.name")
    public List<Product> findProducts(){
        List<Product> products = new ArrayList<>();
        products.add(new Product("beer","john"));
        products.add(new Product("candy","john"));
        products.add(new Product("chocolate","mary"));

        return products;
    }
}
