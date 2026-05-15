package com.java.listassignment;

public interface ProductService {
    public void add(Product product);
    public Product findProductById(int id);
    void findAllProduct();
    void update(int id);
    void delete(Product product);
    void deleteById(int id);
}

