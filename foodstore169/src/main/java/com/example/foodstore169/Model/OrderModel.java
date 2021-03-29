package com.example.foodstore169.Model;

public class OrderModel {
    private final String orderId;
    private final String userId;
    private final String ProductName;
    private final int quantity;
    private final String totalPrice;
    private final String Status;
    private final String Price;

    public OrderModel(String orderId, String userId, String productName, int quantity, String totalPrice, String status, String price) {
        this.orderId = orderId;
        this.userId = userId;
        this.ProductName = productName;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.Status = status;
        this.Price = price;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getUserId() {
        return userId;
    }

    public String getProductName() {
        return ProductName;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public String getStatus() {
        return Status;
    }

    public String getPrice() {
        return Price;
    }
}
