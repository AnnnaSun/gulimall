package com.community.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
//开启远程调用功能
@EnableFeignClients(basePackages = "com.community.gulimall.member.feign")
public class GulimallMemberApplication {
    public static void main(String[] args){
        SpringApplication.run(com.community.gulimall.member.GulimallMemberApplication.class, args);
    }
}