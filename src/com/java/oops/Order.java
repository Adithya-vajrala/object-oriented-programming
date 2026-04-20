package com.java.oops;

public class Order {
    int orderId;
    int userId;
    String productName;
    int totalAmount;
    String status;
    String orderDate;
    String deliveryDate;
    String shippingAddress;
    boolean paymentStatus;

    public Order() {
        orderId = 142334;
        userId = 122214;
        productName = "Shoe";
        totalAmount = 1049;
        status = "Out for delivery";
        orderDate = "24-01-2005";
        deliveryDate = "24-02-2009";
        shippingAddress = "Vizag, India";
        paymentStatus = true;
    }

    public Order(int orderId, int userId, String productName, int totalAmount, String status, String orderDate, String deliveryDate, String shippingAddress, boolean paymentStatus) {
        this.orderId = orderId;
        this.userId = userId;
        this.productName = productName;
        this.totalAmount = totalAmount;
        this.status = status;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.shippingAddress = shippingAddress;
        this.paymentStatus = paymentStatus;
    }
}
