package com.java.oops.abstraction;

public class Attender {
    int money;
    Mro mro;
    ApplicationForm form;

    public Attender(int money, ApplicationForm form,Mro mro) {
        this.money = money;
        this.form = form;
        this.mro = mro;
    }
    public Certificate processCertificate(ApplicationForm form){
        if (money > 500){
            return mro.signedcertificate(form);
        } else {
            return null;
        }
    }
}
