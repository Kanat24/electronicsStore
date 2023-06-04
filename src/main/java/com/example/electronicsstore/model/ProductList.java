package com.example.electronicsstore.model;


public class ProductList {
    private Laptop laptop;
    private Monitor monitor;
    private HardDisk hardDisk;
    private DesktopComputer desktopComputer;

    public ProductList(Laptop laptop) {
        this.laptop = laptop;
    }

    public ProductList(Monitor monitor) {
        this.monitor = monitor;
    }

    public ProductList(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public ProductList(DesktopComputer desktopComputer) {
        this.desktopComputer = desktopComputer;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public DesktopComputer getDesktopComputer() {
        return desktopComputer;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public void setDesktopComputer(DesktopComputer desktopComputer) {
        this.desktopComputer = desktopComputer;
    }
}
