package com.sunjy.secret.demo.nacos.service;

import com.sunjy.secret.demo.nacos.service.fallback.ConfigServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="service-provider" ,fallback = ConfigServiceFallBack.class)
public interface ConfigService {
    @GetMapping("/echo/{s}")
    public String echo(@PathVariable("s") String s);

    @GetMapping("/lb")
    public String lb();
}