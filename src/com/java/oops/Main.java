package com.java.oops;
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product("shoe",5223,"boats","campus","useful for Sports",999,(byte) 10,900,4.5F,(short) 105,false,(byte) 10);
        System.out.println("-----------Product1 Details-----------");
        product1.displayProductDetails();
        System.out.println("-----------Product2 Details-----------");
        product2.displayProductDetails();
        Customer customer1 = new Customer();
        System.out.println("-----------Customer1 Details------------");
        customer1.displayCustomerDetails();
        Customer customer2 = new Customer("sai",12342,"sai@14235",939234567L,'M',"7645363",522647,"vinukonda");
        System.out.println("----------------Customer2 Details--------------");
        customer2.displayCustomerDetails();
        Order order = new Order();
        System.out.println("--------------- Order1 Details ------------");
        order.displayOrderDetails();
        Order order1 = new Order(52261,522647,"Shirt",1999,"order is picking","22-12-1997","17-01-1998","Guntur,India",false);
        System.out.println("--------------- Order2 Details ------------");
        order1.displayOrderDetails();
    }
}