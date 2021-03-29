package com.example.foodstore169.DAO;

import com.example.foodstore169.Model.UserModel;


public interface UserDao {
    int insertUser();

    int insertUser(UserModel user);


     boolean saveUser(UserModel user);
}
