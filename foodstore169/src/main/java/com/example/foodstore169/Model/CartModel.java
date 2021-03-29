package com.example.foodstore169.Model;

public class CartModel {
    private final String CartitemID;
    private final UserModel userId;
    private final String ProductName;
    private final int Quantity;
    private final String price;

    public CartModel(String cartitemID, UserModel userId, String productName, int quantity, String price) {
        CartitemID = cartitemID;
        this.userId = userId;
        ProductName = productName;
        Quantity = quantity;
        this.price = price;
    }

    public String getCartitemID() {
        return CartitemID;
    }

    public UserModel getUserId() {
        return userId;
    }

    public String getProductName() {
        return ProductName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public String getPrice() {
        return price;
    }
}
