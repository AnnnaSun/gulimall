package com.community.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.community.gulimall.common.utils.PageUtils;
import com.community.gulimall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author AnnaSun
 * @email sjmnbb@126.com
 * @date 2024-03-07 22:02:03
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

