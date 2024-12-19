package com.telusko.SecurityEx01.controller;

import com.telusko.SecurityEx01.model.UserModel;
import com.telusko.SecurityEx01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public UserModel registerUser(@RequestBody UserModel user) {
        return userService.registerUser(user);
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody UserModel user) {
        System.out.println(user);

        return userService.verifyUser(user);
    }
}
