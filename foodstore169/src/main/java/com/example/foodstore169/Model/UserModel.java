package com.example.foodstore169.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.*;


public class UserModel {
    private final String email;
    private final String password;
    private final String username;
    private final String mobileNumber;
    private final Boolean active;
    private final String role;
    private final CartModel cart;
    private final List<OrderModel> ordersList;


    public UserModel(@JsonProperty("email") String email, @JsonProperty("pwd") String password, @JsonProperty("username") String username, @JsonProperty("mobNo") String mobileNumber, @JsonProperty("active") Boolean active, @JsonProperty("role") String role, CartModel cart, List<OrderModel> ordersList) {
        this.email = email;
        this.password = password;
        this.username = username;
        this.mobileNumber = mobileNumber;
        this.active = active;
        this.role = role;
        this.cart = cart;
        this.ordersList = ordersList;
    }

    public String getEmail() {
        return email;
    }

    public CartModel getCart() {
        return cart;
    }

    public List<OrderModel> getOrdersList() {
        return ordersList;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public Boolean getActive() {
        return active;
    }

    public String getRole() {
        return role;
    }

}
