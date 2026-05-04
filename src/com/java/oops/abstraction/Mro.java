package com.java.oops.abstraction;

import java.util.concurrent.Callable;

public class Mro {
    int money;
    ApplicationForm form;
    Certificate certificate = null;

    public Mro(int money, ApplicationForm form) {
        this.money = money;
        this.form = form;
    }
    public Certificate signedcertificate(ApplicationForm form){
        if (money > 500){
            certificate = new Certificate(1,form.applicationName,form.customer.name,form.customer.name,"Adithya","22-12-2209");
        }
        return certificate;
    }
}
