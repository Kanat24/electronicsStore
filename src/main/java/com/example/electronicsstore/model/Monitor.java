package com.example.electronicsstore.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
public class Monitor extends Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private int diagonal;

    public Monitor(long seriesNumber, String manufacturer, int price, int quantityInStock, int diagonal) {
        super(seriesNumber, manufacturer, price, quantityInStock);
        if (diagonal <= 0) {
            throw new RuntimeException("Неверный формат");
        } else
            this.diagonal = diagonal;
    }

    public Monitor() {
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monitor monitor = (Monitor) o;
        return diagonal == monitor.diagonal && Objects.equals(id, monitor.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, diagonal);
    }
}


