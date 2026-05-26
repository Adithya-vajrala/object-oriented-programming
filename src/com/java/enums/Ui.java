package com.java.enums;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class Ui {
    List<Customer> customers = new ArrayList<>();

    public int menu(){
        System.out.println("---------- menu -----------");
        System.out.println("1.Sign in");
        System.out.println("2.Sign up");
        System.out.println("3.Display All customer:");
        int ch = InputUtil.getInt("Enter your Choice:");
        return ch;
    }

    public Customer signupMenu(){
        Customer customer = new Customer();
        int id = InputUtil.getInt("Enter ID:");
        customer.setId(id);
        String name = InputUtil.getString("Enter Name:");
        customer.setName(name);
        String email = InputUtil.getString("Enter Email:");
        customer.setEmail(email);
        String gender = InputUtil.getString("Enter the Gender(MALE/FEMALE/OTHER):");
        if (gender == "MALE"){
            customer.setGender(Gender.MALE);
        }
        else if (gender == "FEMALE"){
            customer.setGender(Gender.FEMALE);
        }
        else {
            customer.setGender(Gender.OTHERS);
        }
        return customer;
    }
    public void signInMenu(){
        String name = InputUtil.getString("Enter name:");
        Customer customer = customers.stream().filter(c -> c.getName() == name).findFirst().get();
        System.out.println(customer);
    }
    public void displayALL(){
        System.out.println("----------- ALL Customers --------");
        System.out.printf("%10s,%10s,%10s,%10s","ID","NAME","");
    }
    public void start(){
        switch (menu()){
            case 1:
                signInMenu();
            case 2:
                customers.add(signupMenu());
                break;
            default:
                System.out.println("invalid option");
        }
    }
}
