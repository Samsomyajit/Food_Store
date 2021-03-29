package com.example.foodstore169.DAO;

import com.example.foodstore169.Model.OrderModel;

import java.util.List;
import java.util.UUID;

public interface OrderDao {

    int insertOrder(OrderModel order);

    default int insertOrder(String orderId, OrderModel order){
        orderId = UUID.randomUUID().toString();
        return insertOrder(orderId, order);
    }
    boolean saveOrder(String userId);
    List<OrderModel> getUserProducts(String userId);

}
