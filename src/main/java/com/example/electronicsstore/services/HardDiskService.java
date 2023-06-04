package com.example.electronicsstore.services;

import com.example.electronicsstore.model.DesktopComputer;
import com.example.electronicsstore.model.HardDisk;
import com.example.electronicsstore.repositories.HardDiskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HardDiskService {
    private final HardDiskRepository hardDiskRepository;

    public HardDiskService(HardDiskRepository hardDiskRepository) {
        this.hardDiskRepository = hardDiskRepository;
    }


    public HardDisk addHardDisk(HardDisk hardDisk) {
        return hardDiskRepository.save(hardDisk);
    }

    public HardDisk editHardDisk(long id, HardDisk hardDisk) {
        HardDisk dbHardDisk = hardDiskRepository.findById(id).orElseThrow(RuntimeException::new);
        dbHardDisk.setVolume(hardDisk.getVolume());
        dbHardDisk.setManufacturer(hardDisk.getManufacturer());
        dbHardDisk.setPrice(hardDisk.getPrice());
        dbHardDisk.setQuantityInStock(hardDisk.getQuantityInStock());
        dbHardDisk.setSeriesNumber(hardDisk.getSeriesNumber());
        return hardDiskRepository.save(dbHardDisk);
    }

    public List<HardDisk> getAllHardDisk() {
        return hardDiskRepository.findAll();
    }
}
