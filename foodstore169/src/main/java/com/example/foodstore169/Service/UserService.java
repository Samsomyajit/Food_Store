package com.example.foodstore169.Service;

import com.example.foodstore169.DAO.UserDao;
import com.example.foodstore169.Model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;



@Service
public class UserService {
    private final UserDao userDao;

    @Autowired
    public UserService(@Qualifier("userDao") UserDao userDao) {
        this.userDao = userDao;
    }
    public int addUser(UserModel user){
        return userDao.insertUser(user);
    }

    public boolean getUser(UserModel user){
        return userDao.saveUser(user);
    }
}
