package com.example.electronicsstore.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class HardDisk extends Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private int volume;

    public HardDisk(long seriesNumber, String manufacturer, int price, int quantityInStock, int volume) {
        super(seriesNumber, manufacturer, price, quantityInStock);
        if (volume <= 0) {
            throw new RuntimeException("Неверный формат");
        } else
            this.volume = volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HardDisk hardDisk = (HardDisk) o;
        return volume == hardDisk.volume && Objects.equals(id, hardDisk.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, volume);
    }
}


