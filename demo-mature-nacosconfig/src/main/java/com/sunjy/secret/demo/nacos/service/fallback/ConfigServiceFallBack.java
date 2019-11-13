package com.sunjy.secret.demo.nacos.service.fallback;


import com.sunjy.secret.demo.nacos.service.ConfigService;
import org.springframework.stereotype.Component;

@Component
public class ConfigServiceFallBack implements ConfigService {

    @Override
    public String echo(String s) {
        return "echo()程序有问题";
    }

    @Override
    public String lb() {
        return "lb()程序有问题";
    }
}

