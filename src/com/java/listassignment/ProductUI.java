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
}