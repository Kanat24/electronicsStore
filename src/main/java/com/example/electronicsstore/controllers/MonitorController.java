package com.example.electronicsstore.controllers;

import com.example.electronicsstore.model.Laptop;
import com.example.electronicsstore.model.Monitor;
import com.example.electronicsstore.services.MonitorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/monitor")
public class MonitorController {

    private final MonitorService monitorService;

    public MonitorController(MonitorService monitorService) {
        this.monitorService = monitorService;
    }


    @PostMapping("/add")
    public ResponseEntity<Monitor> addLaptop(@RequestBody Monitor monitor){
        if (monitorService==null){
            ResponseEntity.badRequest().build();
        }
        assert monitorService != null;
        Monitor dbMonitor = monitorService.addMonitor(monitor);
        return ResponseEntity.ok(dbMonitor);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Monitor> updateLaptop(@PathVariable ("id") long id,
                                               @RequestBody(required = false) Monitor monitor){
        Monitor updateMonitor = monitorService.editMonitor(id, monitor);
        return ResponseEntity.ok(updateMonitor);
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<Monitor>>getAllMonitor(){
        return ResponseEntity.ok(monitorService.getAllMonitor());
    }
}
