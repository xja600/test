package com.example.eureka_client.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("testController")
    public  String TestController(){
        System.out.println("============hello world !===========");
        return "hello world";
    }
}
