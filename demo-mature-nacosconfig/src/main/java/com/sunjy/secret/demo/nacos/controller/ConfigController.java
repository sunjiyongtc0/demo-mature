package com.sunjy.secret.demo.nacos.controller;


import com.sunjy.secret.demo.nacos.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
//刷新范围,,,用来数据实时刷新、更新
@RefreshScope
@RestController
public class ConfigController {
    @Value("${user.name}")
    private String user;
    @Autowired
    private ConfigService cs;

    @GetMapping("/user")
    public  String getUser(){
        return user;
    }

    @GetMapping("/getfecho/{s}")
    public String echo(@PathVariable("s") String str){
        return cs.echo(str);
    }

    @GetMapping("/getflb")
    public String flb(){
        return cs.lb();
    }
}
