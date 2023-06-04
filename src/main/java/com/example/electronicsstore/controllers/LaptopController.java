package com.example.electronicsstore.controllers;

import com.example.electronicsstore.model.HardDisk;
import com.example.electronicsstore.model.Laptop;
import com.example.electronicsstore.services.LaptopService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/laptop")
public class LaptopController {

    private final LaptopService laptopService;

    public LaptopController(LaptopService laptopService) {
        this.laptopService = laptopService;
    }

    @PostMapping("/add")
    public ResponseEntity<Laptop> addLaptop(@RequestBody Laptop laptop) {
        if (laptopService == null) {
            ResponseEntity.badRequest().build();
        }
        assert laptopService != null;
        Laptop dbLaptop = laptopService.addLaptop(laptop);
        return ResponseEntity.ok(dbLaptop);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Laptop> updateLaptop(@PathVariable("id") long id,
                                               @RequestBody(required = false) Laptop laptop) {
        Laptop updateLaptop = laptopService.editLaptop(id, laptop);
        return ResponseEntity.ok(updateLaptop);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Laptop>> getAllLaptop() {
        return ResponseEntity.ok(laptopService.getAllLaptop());
    }
}
