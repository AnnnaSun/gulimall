package com.community.gulimall.member.dao;

import com.community.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author AnnaSun
 * @email sjmnbb@126.com
 * @date 2024-03-07 22:33:31
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
