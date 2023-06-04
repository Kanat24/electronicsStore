package com.example.electronicsstore.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    protected long seriesNumber;
    protected String manufacturer;
    protected int price;
    protected int quantityInStock;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product(long seriesNumber, String manufacturer, int price, int quantityInStock) {
        this.seriesNumber = seriesNumber;
        this.manufacturer = manufacturer;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public Product() {
    }

    public long getSeriesNumber() {
        return seriesNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setSeriesNumber(long seriesNumber) {
        this.seriesNumber = seriesNumber;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
}
