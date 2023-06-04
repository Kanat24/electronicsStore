package com.example.electronicsstore.repositories;

import com.example.electronicsstore.model.Monitor;
import com.example.electronicsstore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
