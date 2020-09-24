package com.example.hello.controller;

import com.example.hello.bean.UserBean;
import com.example.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/{id}")
    public Object showUser(@PathVariable("id") int id){
        UserBean user= userService.getUser(id);
        if(user != null){
            return user;
        }
        else{
            return "查询为空！";
        }
          //return user.toString();
    }
}