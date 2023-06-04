package com.example.electronicsstore;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class ElectronicsStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElectronicsStoreApplication.class, args);
    }

}
