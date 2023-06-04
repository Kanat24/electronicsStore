package com.example.electronicsstore.services;

import com.example.electronicsstore.model.DesktopComputer;
import com.example.electronicsstore.model.Product;
import com.example.electronicsstore.model.ProductList;
import com.example.electronicsstore.repositories.DesktopComputerRepository;
import com.example.electronicsstore.repositories.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getById(Long id) {
        return productRepository.findById(id).orElseThrow(RuntimeException::new);

    }
}
