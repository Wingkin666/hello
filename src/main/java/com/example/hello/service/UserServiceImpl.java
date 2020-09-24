package com.example.hello.service;

import com.example.hello.bean.UserBean;
import com.example.hello.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    //将DAO注入Service层
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserBean getUser(int id) {
        return userMapper.getInfo(id);
    }
}
