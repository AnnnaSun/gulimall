package com.community.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.community.common.utils.PageUtils;
import com.community.gulimall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author AnnaSun
 * @email sjmnbb@126.com
 * @date 2024-03-04 21:39:17
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

