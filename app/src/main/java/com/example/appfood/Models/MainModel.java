package com.example.appfood.Models;

public class MainModel {
    int imgage;
    String name,price, description;

    public MainModel(int imgage, String name, String price, String description) {
        this.imgage = imgage;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public int getImgage() {
        return imgage;
    }

    public void setImgage(int imgage) {
        this.imgage = imgage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
