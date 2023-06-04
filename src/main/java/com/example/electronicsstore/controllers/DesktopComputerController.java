package com.example.electronicsstore.controllers;

import com.example.electronicsstore.model.DesktopComputer;
import com.example.electronicsstore.model.Product;
import com.example.electronicsstore.services.DesktopComputerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/DesktopComputer")
public class DesktopComputerController {
   private final DesktopComputerService desktopComputerService;

    public DesktopComputerController(DesktopComputerService desktopComputerService) {
        this.desktopComputerService = desktopComputerService;
    }

    @PostMapping("/addDesktopComputer")
    public ResponseEntity<DesktopComputer> addDesktopComputer(@RequestBody DesktopComputer desktopComputer){
        if (desktopComputer==null){
            ResponseEntity.badRequest().build();
        }
        DesktopComputer newDesktopComputer = desktopComputerService.addDesktopComputer(desktopComputer);
        return ResponseEntity.ok(newDesktopComputer);
    }
    @PutMapping("/updateDesktopComputer/{id}")
    public ResponseEntity<Product> updateDesktopComputer(@PathVariable ("id") long id,
                @RequestBody(required = false) DesktopComputer desktopComputer){
        DesktopComputer updateDesktopComputer = desktopComputerService.editDesktopComputer(id, desktopComputer);
        return ResponseEntity.ok(updateDesktopComputer);
    }
    @GetMapping("/getAllDesktopComputer")
    public ResponseEntity<List<DesktopComputer>>getAllDesktopComputer(){
        return ResponseEntity.ok(desktopComputerService.getAllDesktopComputer());
    }
}
