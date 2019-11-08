package com.sunjy.secret.demo.consumer.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="service-provider")
public interface EchoService {
    @GetMapping("/echo/{s}")
    public String echo(@PathVariable("s") String s);
}
