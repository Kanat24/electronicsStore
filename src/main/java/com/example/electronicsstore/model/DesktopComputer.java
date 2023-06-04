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
public class DesktopComputer extends Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private FormFactor formFactor;

    public DesktopComputer(long seriesNumber, String manufacturer, int price, int quantityInStock, FormFactor formFactor) {
        super(seriesNumber, manufacturer, price, quantityInStock);
        this.formFactor = formFactor;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DesktopComputer that = (DesktopComputer) o;
        return Objects.equals(id, that.id) && formFactor == that.formFactor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, formFactor);
    }
}
enum FormFactor{
    DESKTOP, NETTOP, MONOBLOCK
}