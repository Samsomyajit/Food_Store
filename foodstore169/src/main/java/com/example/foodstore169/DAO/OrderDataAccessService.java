package com.example.foodstore169.DAO;

import com.example.foodstore169.Model.OrderModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("orderDao")
public class OrderDataAccessService  implements OrderDao{
    @Override
    public int insertOrder(OrderModel order) {
        return 0;
    }

    @Override
    public int insertOrder(String orderId, OrderModel order) {
        return 0;
    }

    @Override
    public boolean saveOrder(String userId) {
        return false;
    }

    @Override
    public List<OrderModel> getUserProducts(String userId) {
        return null;
    }
}
