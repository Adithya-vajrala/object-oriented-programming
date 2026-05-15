package com.java.listassignment;
import com.java.listassignment.InputUtil;

public class ProductUI {
    public Product getProductDetails(){
        System.out.println("Enter the product details");
        int id = InputUtil.getInt("Enter the Product Id:");
        String name = InputUtil.getString("Enter the Product Name");
        String category = InputUtil.getString("Enter the Category");
        int maxRetailPrice = InputUtil.getInt("Enter the MRP:");
        return new Product(id,name,category,maxRetailPrice);
    }
    public int userOptionMenu(){
        System.out.println("\n----- PRODUCTS MANAGEMENT SYSTEM ------");
        System.out.println("1. Add Product");
        System.out.println("2. Display All Products");
        System.out.println("3. Search Product");
        System.out.println("4. Update Product");
        System.out.println("5. Delete Product");
        System.out.println("6. Exit");
        int choice = InputUtil.getInt("Enter the your Choice:");
        return choice;
    }
}