package com.example.electronicsstore.services;

import com.example.electronicsstore.model.HardDisk;
import com.example.electronicsstore.model.Laptop;
import com.example.electronicsstore.repositories.LaptopRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LaptopService {
    private final LaptopRepository laptopRepository;

    public LaptopService(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }


    public Laptop addLaptop(Laptop laptop) {
        return laptopRepository.save(laptop);
    }

    public Laptop editLaptop(long id, Laptop laptop) {
        Laptop dbLaptop = laptopRepository.findById(id).orElseThrow(RuntimeException::new);
        dbLaptop.setSize(laptop.getSize());
        dbLaptop.setManufacturer(laptop.getManufacturer());
        dbLaptop.setPrice(laptop.getPrice());
        dbLaptop.setQuantityInStock(laptop.getQuantityInStock());
        dbLaptop.setSeriesNumber(laptop.getSeriesNumber());
        return laptopRepository.save(dbLaptop);
    }

    public List<Laptop> getAllLaptop() {
        return laptopRepository.findAll();
    }
}
