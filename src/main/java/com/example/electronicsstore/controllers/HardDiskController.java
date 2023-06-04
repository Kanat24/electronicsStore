package com.example.electronicsstore.controllers;

import com.example.electronicsstore.model.DesktopComputer;
import com.example.electronicsstore.model.HardDisk;
import com.example.electronicsstore.model.Product;
import com.example.electronicsstore.services.HardDiskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hardDisk")
public class HardDiskController {
        private final HardDiskService hardDiskService;

    public HardDiskController(HardDiskService hardDiskService) {
        this.hardDiskService = hardDiskService;
    }


    @PostMapping("/add")
        public ResponseEntity<HardDisk> addHardDiskService(@RequestBody HardDisk hardDisk){
            if (hardDiskService==null){
                ResponseEntity.badRequest().build();
            }
        assert hardDiskService != null;
        HardDisk newHardDisk = hardDiskService.addHardDisk(hardDisk);
            return ResponseEntity.ok(newHardDisk);
        }
        @PutMapping("/update/{id}")
        public ResponseEntity<HardDisk> updateDesktopComputer(@PathVariable ("id") long id,
                                                             @RequestBody(required = false) HardDisk hardDisk){
            HardDisk updateHardDisk = hardDiskService.editHardDisk(id, hardDisk);
            return ResponseEntity.ok(updateHardDisk);
        }
        @GetMapping("/getAll")
        public ResponseEntity<List<HardDisk>>getAllHardDisk(){
            return ResponseEntity.ok(hardDiskService.getAllHardDisk());
        }

}
