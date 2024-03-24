package com.community.gulimall.member.feign;

import com.community.gulimall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//feignclient定义调用在nacos注册的微服务的名字
//body里定义在远程微服务里调用的远程controller地址和方法（哪个服务那个方法）
//在main方法里开启远程调用功能
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();
}
