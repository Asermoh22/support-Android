package com.example.myapplication;

public class listitem {
String brand;
String model;
int size;
String description;

    public listitem(String brand, String model, int size, String description) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
