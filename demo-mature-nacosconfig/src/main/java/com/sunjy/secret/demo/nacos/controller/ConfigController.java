package com.sunjy.secret.demo.nacos.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@RestController
public class ConfigController {
    @Value("${user.name}")
    private String user;

    @GetMapping("/user")
    public  String getUser(){
        return user;
    }
}
