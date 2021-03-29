package com.example.foodstore169.DAO;

import com.example.foodstore169.Model.UserModel;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("userDao")
public class UserDataAccessService implements UserDao{

    private static List<UserModel> DB = new ArrayList<>();
    private UserModel user;


    @Override
    public int insertUser() {
        return insertUser();
    }

    @Override
    public int insertUser(UserModel user) {
        this.user = user;
        DB.add(new UserModel(user.getUsername(), user.getEmail(), user.getPassword(), user.getMobileNumber(), user.getActive(), user.getRole(), user.getCart(), user.getOrdersList()));
        return 0;
    }

    @Override
    public boolean saveUser(UserModel user) {
        return DB.contains(user);
    }

}
