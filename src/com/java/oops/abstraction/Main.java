package com.java.oops.abstraction;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(12,"adithya",21,"9392723505","adithya@142003");
        ApplicationForm form = new ApplicationForm("date Of Birth",123,customer);
        Mro mro = new Mro(2000,form);
        Attender attender = new Attender(2000,form,mro);
        CertificateService service = new CertificateServicebyGov(attender);
        Certificate certificate = service.getMyCertficate(form);
        System.out.println("ID:" + certificate.id + "\nName of the Certificate:" + certificate.name + "\nTo:" + certificate.certifiedTo + "\nFrom:" + certificate.certifiedFrom + "\nDate:" + certificate.date);
    }
}
