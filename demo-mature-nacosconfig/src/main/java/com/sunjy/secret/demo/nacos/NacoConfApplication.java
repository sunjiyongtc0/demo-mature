package com.sunjy.secret.demo.nacos;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class NacoConfApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacoConfApplication.class,args);
    }
}
