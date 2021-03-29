package com.example.foodstore169.API;

import com.example.foodstore169.Model.UserModel;
import com.example.foodstore169.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RequestMapping("api/v1/user")
@RestController
public class SignupController {
    private final UserService userService;

    @Autowired
    public SignupController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void saveUser(@RequestBody UserModel user){
        userService.addUser(user);
    }

    @GetMapping
    public boolean getUser(UserModel user){ return userService.getUser(user);}
}
