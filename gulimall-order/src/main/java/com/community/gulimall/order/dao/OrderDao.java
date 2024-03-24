package com.community.gulimall.order.dao;

import com.community.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author AnnaSun
 * @email sjmnbb@126.com
 * @date 2024-03-07 22:39:24
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
