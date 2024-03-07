package com.community.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.community.gulimall.common.utils.PageUtils;
import com.community.gulimall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author AnnaSun
 * @email sjmnbb@126.com
 * @date 2024-03-07 22:39:24
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

