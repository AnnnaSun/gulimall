package com.community.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.community.gulimall.common.utils.PageUtils;
import com.community.gulimall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author AnnaSun
 * @email sjmnbb@126.com
 * @date 2024-03-04 21:39:17
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();

    void removeMenuByIds(List<Long> list);
}

