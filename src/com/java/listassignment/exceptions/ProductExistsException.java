package com.java.listassignment.exceptions;

public class ProductExistsException extends RuntimeException{
    public ProductExistsException(String message) {
        super(message);
    }
}
