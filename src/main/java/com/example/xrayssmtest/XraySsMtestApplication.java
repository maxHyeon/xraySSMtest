package com.example.xrayssmtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.xrayssmtest"})
public class XraySsMtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(XraySsMtestApplication.class, args);
    }

}
