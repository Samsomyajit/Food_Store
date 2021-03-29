package com.example.foodstore169.Model;

public class ProductModel {
    private final String productID;
    private final String imageUrl;
    private final String productName;
    private final String price;
    private final String description;
    private final String quantity;

    public ProductModel(String productID, String imageUrl, String productName, String price, String description, String quantity) {
        this.productID = productID;
        this.imageUrl = imageUrl;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
    }

    public String getProductID() {
        return productID;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getProductName() {
        return productName;
    }

    public String getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getQuantity() {
        return quantity;
    }
}
