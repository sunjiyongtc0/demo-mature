package com.sunjy.secret.demo.consumer.controller;

import com.sunjy.secret.demo.consumer.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private EchoService es;

    @GetMapping("/getfecho/{s}")
    public String echo(@PathVariable("s") String str){
        return es.echo(str);
    }

    @GetMapping("/getflb")
    public String flb(){
        return es.lb();
    }
}
