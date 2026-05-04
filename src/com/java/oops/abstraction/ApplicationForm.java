package com.java.oops.abstraction;

public class ApplicationForm {
   String applicationName;
   int id;
   Customer customer;

    public ApplicationForm(String applicationName, int id, Customer customer) {
        this.applicationName = applicationName;
        this.id = id;
        this.customer = customer;
    }
}
