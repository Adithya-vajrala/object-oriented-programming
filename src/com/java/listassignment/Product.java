package com.java.listassignment;

public class Product {
    int id;
    String name;
    String category;
    int maxRetailPrice;

    public Product(int id, String name, String category, int maxRetailPrice) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.maxRetailPrice = maxRetailPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", maxRetailPrice=" + maxRetailPrice +
                '}';
    }
}
