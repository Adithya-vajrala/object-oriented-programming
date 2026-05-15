package com.java.listassignment;

import java.util.Scanner;
import com.java.listassignment.ProductUI;
import com.java.listassignment.exceptions.ProductExistsException;
import com.java.listassignment.exceptions.ProductNotFoundException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductService service = new ProductServiceImpl();
        ProductUI ui = new ProductUI();
        boolean running = true;
        while (running){
            int choice = ui.userOptionMenu();
            switch (choice){
                case 1:
                    Product product = ui.getProductDetails();
                    try {
                        service.add(product);
                    }catch (ProductExistsException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    service.findAllProduct();
                    break;
                case 3:
                    int id = InputUtil.getInt("Enter Id");
                    try {
                        service.findProductById(id);
                    }catch (ProductNotFoundException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    int updatingId = InputUtil.getInt("Enter the id u want to update:");
                    try {
                        service.update(updatingId);
                    }catch (ProductNotFoundException e){
                        e.getMessage();
                    }
                    break;
                case 5:
                    int deletingId = InputUtil.getInt("Enter the Id:");
                    try {
                        service.deleteById(deletingId);
                    }catch (ProductNotFoundException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    running = false;
                    System.out.println("Application is closed");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }

    }
}
