package com.sunjy.secret.demo.consumer.service;


import com.sunjy.secret.demo.consumer.service.fallback.EchoServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="service-provider" ,fallback = EchoServiceFallBack.class)
public interface EchoService {
    @GetMapping("/echo/{s}")
    public String echo(@PathVariable("s") String s);

    @GetMapping("/lb")
    public String lb();
}
