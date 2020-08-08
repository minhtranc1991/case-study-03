package main.java.model.product;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Import {
    private int id;
    private String name;
    private String brand;
    private int size;
    private int quantity;
    private LocalDateTime importTime;
    private String status;

    public Import() {
    }

    public Import(int id, String name, String brand, int size, int quantity, LocalDateTime importTime, String status) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.size = size;
        this.quantity = quantity;
        this.importTime = importTime;
        this.status = status;
    }

    public Import(String name, String brand, int size, int quantity, LocalDateTime importTime, String status) {
        this.name = name;
        this.brand = brand;
        this.size = size;
        this.quantity = quantity;
        this.importTime = importTime;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getImportDateTime() {
        return importTime;
    }

    public String getImportDate() {
        return importTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String getImportTime() {
        return importTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    public void setImportTime(LocalDateTime importTime) {
        this.importTime = importTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Import{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", size=" + size +
                ", quantity=" + quantity +
                ", importTime=" + importTime +
                ", status='" + status + '\'' +
                '}';
    }
}