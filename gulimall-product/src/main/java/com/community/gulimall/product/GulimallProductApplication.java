package com.community.gulimall.product;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1. 整合Mybatis-plus
 *      导入依赖：mybatis-plus-starter
 * 2.配置数据源和mybatis的相关信息
 *      数据库驱动
 *      在application.yml文件中配置数据源信息
 *      配置mybatis-plus:
 *          使用mapperscan
 *          告诉mybatis-plus映射文件地址
 */
@MapperScan("com.community.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {
    public static void main(String[] args){
        SpringApplication.run(com.community.gulimall.product.GulimallProductApplication.class, args);
    }
}