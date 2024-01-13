package com.fantasy.server_user01.controller;


import com.fantasy.pojo.User;

import com.fantasy.server_user01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/{uid}")
    @ResponseBody
    public User findOrderById(@PathVariable("uid") Integer uid){
        return userService.findUserById(uid);
    }

}
