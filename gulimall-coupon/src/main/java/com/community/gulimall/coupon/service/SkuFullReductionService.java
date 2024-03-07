package com.community.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.community.gulimall.common.utils.PageUtils;
import com.community.gulimall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author AnnaSun
 * @email sjmnbb@126.com
 * @date 2024-03-07 22:02:03
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

