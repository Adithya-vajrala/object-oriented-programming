package com.java.oops;

public class Product {
    int id;
    String category;
    String name;
    String company;
    String description;
    int maxRetailPrice;
    byte discountPercentage;
    int finalSellingPrice;
    float rating;
    short ratingCount;
    boolean isAvailable;
    byte size;

    public Product() {
        id = 1324;
        category = "slippers";
        name = "slipper";
        company = "paragon";
        description = "Very comfortable";
        maxRetailPrice = 134;
        discountPercentage = 10;
        finalSellingPrice = 100;
        rating = 4.6F;
        ratingCount = 100;
        isAvailable = true;
        size = 9;
    }
    public Product(String category, int id, String name, String company, String description, int maxRetailPrice, byte discountPercentage, int finalSellingPrice, float rating, short ratingCount, boolean isAvailable, byte size) {
        this.category = category;
        this.id = id;
        this.name = name;
        this.company = company;
        this.description = description;
        this.maxRetailPrice = maxRetailPrice;
        this.discountPercentage = discountPercentage;
        this.finalSellingPrice = finalSellingPrice;
        this.rating = rating;
        this.ratingCount = ratingCount;
        this.isAvailable = isAvailable;
        this.size = size;
    }
}

