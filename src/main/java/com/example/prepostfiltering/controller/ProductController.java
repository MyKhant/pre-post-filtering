package com.example.prepostfiltering.controller;

import com.example.prepostfiltering.ds.Product;
import com.example.prepostfiltering.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/sell")
    public List<Product> sellProducts(){
        List<Product> products = new ArrayList<>();
        products.add(new Product("beer","john"));
        products.add(new Product("candy","john"));
        products.add(new Product("chocolate","mary"));

        return productService.sellProducts(products);
    }
    @GetMapping("/find")
    public List<Product> findProduct(){
        return productService.findProducts();
    }

}
