package com.example.electronicsstore.repositories;

import com.example.electronicsstore.model.HardDisk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HardDiskRepository extends JpaRepository<HardDisk, Long> {
}
