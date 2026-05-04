package com.java.oops.inheritance;

public class Customer {
    int id;
    String name;
    String email;
    int mrp;

    public Customer() {
    }

    public Customer(int id, String name, String email, int mrp) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mrp = mrp;
    }
    public void displayDetails(){
        System.out.println("ID:" + id);
        System.out.println("Name:" + name);
        System.out.println("Email:" + email);
        System.out.println("MRP:" + mrp);
    }
}
