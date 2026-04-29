package com.java.oops.inheritance;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the MRP of the product: ");
        int maximumRetailPrice = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Membership Type: ");
        String membershipType = scanner.nextLine();
        if (membershipType == "Normal"){
            RegularCustomer normal = new RegularCustomer(12,"shoe","vajrala@gamil.com",maximumRetailPrice,50,"regular");
            normal.displayingPayoutAmount();
        }else {
            PremiumCustomer premium = new PremiumCustomer(13,"pant","v@1324",maximumRetailPrice,0,"premium");
            premium.displayingPayoutAmount();
        }
        scanner.close();
    }
}
