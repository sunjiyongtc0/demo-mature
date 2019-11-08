package com.sunjy.secret.demo.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
    private final RestTemplate restTemplate;
    @Autowired
    public TestController(RestTemplate restTemplate){
        this.restTemplate=restTemplate;
    }
    @GetMapping("/getecho/{s}")
    public String echo(@PathVariable("s") String str){
        return restTemplate.getForObject("http://service-provider/echo/"+str,String.class);
    }
}
