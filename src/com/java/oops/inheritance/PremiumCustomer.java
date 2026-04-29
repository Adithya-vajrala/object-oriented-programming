package com.java.oops.inheritance;

public class PremiumCustomer extends Customer {
    int shippingCharges;
    String membershipType;
    float finalPeice = 0;

    public PremiumCustomer(int id, String name, String email,int mrp, int shippingCharges, String membershipType) {
        super(id, name, email, mrp);
        this.shippingCharges = shippingCharges;
        this.membershipType = membershipType;
        finalPeice += mrp * 30/100;
        finalPeice += shippingCharges;
    }
    void displayingPayoutAmount(){
        System.out.println("Regular Customer");
        System.out.println("Shipping Charges: " + shippingCharges);
        System.out.println("Payable Amount: " + finalPeice);
    }
}
