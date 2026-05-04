package com.java.oops.inheritance;

public class RegularCustomer extends Customer{
    int shippingCharges;
    String memberShipType;
    float finalPrice = 0;

    public RegularCustomer(int id, String name, String email,int mrp, int shippingCharges, String memberShipType) {
        super(id, name, email,mrp);
        this.shippingCharges = shippingCharges;
        this.memberShipType = memberShipType;
        finalPrice += mrp - (mrp * 30 / 100) + shippingCharges;
    }
    @Override
    public void displayDetails(){


        super.displayDetails();
        System.out.println("Regular Customer");
        System.out.println("Shipping Charges: " + shippingCharges);
        System.out.println("Payable Amount: " + finalPrice);
    }
}
