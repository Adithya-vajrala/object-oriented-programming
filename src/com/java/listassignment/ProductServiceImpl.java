package com.java.listassignment;

import com.java.listassignment.exceptions.ProductExistsException;
import com.java.listassignment.exceptions.ProductNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService{

    private final List<Product> productList = new ArrayList<>();

    @Override
    public void add(Product product) {
        for (Product p : productList){
            if (p.id == product.id){
                throw new ProductExistsException("Product Already Exists");
            }
        }
        productList.add(product);
        System.out.println("product added successfully");
    }

    @Override
    public Product findProductById(int id) {
        for (Product product:productList){
            if (product.id == id){
                System.out.println(product);
                return product;
            }
        }
        throw new ProductNotFoundException("Product Not Found with this Id:" + id);
    }

    @Override
    public void findAllProduct() {
        if (productList.isEmpty()){
            System.out.println("No Product is there");
            return;
        }
        for (Product product : productList){
            System.out.println(product);
        }
    }

    @Override
    public void update(int id) {
        try {
            Product existsProduct = findProductById(id);
            ProductUI ui = new ProductUI();
            Product newProduct = ui.getProductDetails();
            existsProduct.id = newProduct.id;
            existsProduct.name = newProduct.name;
            existsProduct.category = newProduct.category;
            existsProduct.maxRetailPrice = newProduct.maxRetailPrice;
            System.out.println("product updated succesfully");
        }catch (ProductNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
    @Override
    public void delete(Product product) {
        productList.remove(product);
        System.out.println("product removed successfully");
    }

    @Override
    public void deleteById(int id) {
        try {
            Product product = findProductById(id);
            productList.remove(product);
            System.out.println("product removed successfully");
        }catch (ProductNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
}
