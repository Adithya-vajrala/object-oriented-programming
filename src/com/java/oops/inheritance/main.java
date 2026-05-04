package com.java.oops.inheritance;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the MRP of the product: ");
        int maximumRetailPrice = scanner.nextInt();
        scanner.nextLine();
        //System.out.println("Enter Membership Type: (1- normal),(2-Premium)");
        //int membershipType = scanner.nextInt();
        //if (membershipType == 1){
            RegularCustomer normal = new RegularCustomer(12,"shoe","vajrala@gamil.com",maximumRetailPrice,50,"regular");
            //normal.displayDetails();
       // }else {
            PremiumCustomer premium = new PremiumCustomer(13,"pant","v@1324",maximumRetailPrice,0,"premium");
            //premium.displayDetails();
        //}
        Customer customer = new Customer();
        //customer.displayDetails();
        //normal.displayDetails();
        //premium.displayDetails();
        Service service = new Service();
        service.add(premium);
        scanner.close();
    }
}
