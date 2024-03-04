package com.community.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.community.common.utils.PageUtils;
import com.community.gulimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author AnnaSun
 * @email sjmnbb@126.com
 * @date 2024-03-04 21:39:17
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

