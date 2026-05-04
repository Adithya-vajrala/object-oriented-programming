package com.java.oops.abstraction;

public class Certificate {
int id;
String name;
String applicantName;
String certifiedTo;
String certifiedFrom;
String date;

    public Certificate(int id, String name, String applicantName, String certifiedTo, String certifiedFrom, String date) {
        this.id = id;
        this.name = name;
        this.applicantName = applicantName;
        this.certifiedTo = certifiedTo;
        this.certifiedFrom = certifiedFrom;
        this.date = date;
    }
}
