package com.java.oops;

public class Customer {
    int id;
    String name;
    String emailId;
    long phoneNo;
    char gender;
    String password;
    int pincode;
    String address;
    Customer(){
        id = 20;
        name = "aditya";
        emailId = "adithya@gamil.com";
        phoneNo = 99392723505L;
        gender = 'M';
        password = "12323";
        pincode = 522141;
        address= "vinukonda";
    }
    public Customer(String name, int id, String emailId, long phoneNo, char gender, String password, int pincode, String address) {
        this.name = name;
        this.id = id;
        this.emailId = emailId;
        this.phoneNo = phoneNo;
        this.gender = gender;
        this.password = password;
        this.pincode = pincode;
        this.address = address;
    }
}
