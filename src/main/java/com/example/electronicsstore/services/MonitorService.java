package com.example.electronicsstore.services;

import com.example.electronicsstore.model.Laptop;
import com.example.electronicsstore.model.Monitor;
import com.example.electronicsstore.repositories.MonitorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonitorService {
    private final MonitorRepository monitorRepository;

    public MonitorService(MonitorRepository monitorRepository) {
        this.monitorRepository = monitorRepository;
    }

    public Monitor addMonitor(Monitor monitor) {
        return monitorRepository.save(monitor);
    }

    public Monitor editMonitor(long id, Monitor monitor) {
        Monitor dbMonitor = monitorRepository.findById(id).orElseThrow(RuntimeException::new);
        dbMonitor.setDiagonal(monitor.getDiagonal());
        dbMonitor.setManufacturer(monitor.getManufacturer());
        dbMonitor.setPrice(monitor.getPrice());
        dbMonitor.setQuantityInStock(monitor.getQuantityInStock());
        dbMonitor.setSeriesNumber(monitor.getSeriesNumber());
        return monitorRepository.save(dbMonitor);
    }

    public List<Monitor> getAllMonitor() {
        return monitorRepository.findAll();
    }
}
