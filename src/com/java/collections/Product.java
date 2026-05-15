package com.java.collections;

import java.util.Objects;

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

    public Product(int id, String category, String name, String company, String description, int maxRetailPrice, byte discountPercentage, int finalSellingPrice, float rating, short ratingCount, boolean isAvailable, byte size) {
        this.id = id;
        this.category = category;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && maxRetailPrice == product.maxRetailPrice && discountPercentage == product.discountPercentage && finalSellingPrice == product.finalSellingPrice && Float.compare(rating, product.rating) == 0 && ratingCount == product.ratingCount && isAvailable == product.isAvailable && size == product.size && Objects.equals(category, product.category) && Objects.equals(name, product.name) && Objects.equals(company, product.company) && Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, name, company, description, maxRetailPrice, discountPercentage, finalSellingPrice, rating, ratingCount, isAvailable, size);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", description='" + description + '\'' +
                ", maxRetailPrice=" + maxRetailPrice +
                ", discountPercentage=" + discountPercentage +
                ", finalSellingPrice=" + finalSellingPrice +
                ", rating=" + rating +
                ", ratingCount=" + ratingCount +
                ", isAvailable=" + isAvailable +
                ", size=" + size +
                '}';
    }
}
