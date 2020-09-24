package com.example.hello;

import com.example.hello.bean.UserBean;
import com.example.hello.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@SpringBootTest
public class HelloApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
        /*UserBean userBean = userService.loginIn("a","a");
        System.out.println("该用户ID为：");
        System.out.println(userBean.getId());*/
    }

}