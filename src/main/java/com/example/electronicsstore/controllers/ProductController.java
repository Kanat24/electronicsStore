package com.example.electronicsstore.controllers;

import com.example.electronicsstore.model.*;
import com.example.electronicsstore.services.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Product> getByIdProduct(@PathVariable("id") long id) {
        Product product = productService.getById(id);
        return ResponseEntity.ok(product);
    }
}
