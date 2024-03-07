package com.community.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.community.gulimall.common.utils.PageUtils;
import com.community.gulimall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author AnnaSun
 * @email sjmnbb@126.com
 * @date 2024-03-07 22:42:03
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

