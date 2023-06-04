package com.example.electronicsstore.services;

import com.example.electronicsstore.model.DesktopComputer;
import com.example.electronicsstore.repositories.DesktopComputerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesktopComputerService {

    private final DesktopComputerRepository desktopComputerRepository;
    public DesktopComputerService(DesktopComputerRepository desktopComputerRepository) {
        this.desktopComputerRepository = desktopComputerRepository;
    }

    public DesktopComputer addDesktopComputer(DesktopComputer desktopComputer) {
        return desktopComputerRepository.save(desktopComputer);
    }
    public List<DesktopComputer> getAllDesktopComputer() {
        return desktopComputerRepository.findAll();
    }
    public DesktopComputer editDesktopComputer(Long id, DesktopComputer desktopComputer){
        DesktopComputer dbDesktopComputer = desktopComputerRepository.findById(id).orElseThrow(RuntimeException::new);
        dbDesktopComputer.setFormFactor(desktopComputer.getFormFactor());
        dbDesktopComputer.setManufacturer(desktopComputer.getManufacturer());
        dbDesktopComputer.setPrice(desktopComputer.getPrice());
        dbDesktopComputer.setQuantityInStock(desktopComputer.getQuantityInStock());
        dbDesktopComputer.setSeriesNumber(desktopComputer.getSeriesNumber());
        return desktopComputerRepository.save(dbDesktopComputer);
    }
}
