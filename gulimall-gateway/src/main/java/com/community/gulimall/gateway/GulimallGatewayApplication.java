package com.community.gulimall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
//取消讀取數據庫配置的操作，避免啟動報錯
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class GulimallGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(com.community.gulimall.gateway.GulimallGatewayApplication.class, args);
    }
}