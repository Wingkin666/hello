package com.example.hello;

import com.sensorsdata.analytics.javasdk.exceptions.InvalidArgumentException;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
@MapperScan("com.example.hello.mapper")
public class HelloApplication {

    public static void main(String[] args) throws IOException, InvalidArgumentException {
        SpringApplication.run(HelloApplication.class, args);
    }

}
