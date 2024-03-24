package com.community.gulimall.product.dao;

import com.community.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author AnnaSun
 * @email sjmnbb@126.com
 * @date 2024-03-04 21:39:17
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
