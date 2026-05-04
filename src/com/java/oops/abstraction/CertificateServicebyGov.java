package com.java.oops.abstraction;

public class CertificateServicebyGov extends CertificateService {
    Attender attender;

    public CertificateServicebyGov(Attender attender) {
        this.attender = attender;
    }
    @Override
    public  Certificate getMyCertficate(ApplicationForm form){
        return attender.processCertificate(form);
    }
    public void displayCertificate(){

    }
}
