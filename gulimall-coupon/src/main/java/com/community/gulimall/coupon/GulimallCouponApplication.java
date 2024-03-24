package com.community.gulimall.coupon;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//开启服务发现的客户端
@EnableDiscoveryClient
public class GulimallCouponApplication {
    public static void main(String[] args){
        SpringApplication.run(com.community.gulimall.coupon.GulimallCouponApplication.class, args);
    }
}