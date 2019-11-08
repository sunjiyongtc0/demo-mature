package com.sunjy.secret.demo.consumer.service.fallback;

import com.sunjy.secret.demo.consumer.service.EchoService;
import org.springframework.stereotype.Component;

@Component
public class EchoServiceFallBack  implements EchoService {

    @Override
    public String echo(String s) {
        return "echo()程序有问题";
    }

    @Override
    public String lb() {
        return "lb()程序有问题";
    }
}

