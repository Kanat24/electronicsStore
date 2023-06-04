package com.example.electronicsstore.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Laptop extends Product{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Size size;

    public Laptop(long seriesNumber, String manufacturer, int price, int quantityInStock, Size size) {
        super(seriesNumber, manufacturer, price, quantityInStock);
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(id, laptop.id) && size == laptop.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, size);
    }
}
enum Size {
        SIZE_13(13),
        SIZE_14(14),
        SIZE_15(15),
        SIZE_17(17);

    public  final int count;

    Size(int count) {
        this.count = count;
    }
}
