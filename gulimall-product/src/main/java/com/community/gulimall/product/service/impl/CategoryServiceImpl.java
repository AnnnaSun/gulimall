package com.community.gulimall.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.community.gulimall.common.utils.PageUtils;
import com.community.gulimall.common.utils.Query;

import com.community.gulimall.product.dao.CategoryDao;
import com.community.gulimall.product.entity.CategoryEntity;
import com.community.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {


    @Autowired
    CategoryDao categoryDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> entityList = categoryDao.selectList(null);

        List<CategoryEntity> parentEntities = entityList.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid()==0;
        }).map(menu->{
            menu.setChildren(getChildren(menu, entityList));
            return menu;
                })
        .sorted((menu1, menu2)->{
            return (menu1.getSort() == null? 0: menu1.getSort())-(menu2.getSort() == null? 0: menu2.getSort());
        })
        .collect(Collectors.toList());
        return parentEntities;
    }

    @Override
    public void removeMenuByIds(List<Long> list) {
//        TODO: 1.检查当前删除的菜单是否被其他地方引用

//        最好使用逻辑删除，用字段来标记是否删除
        baseMapper.deleteBatchIds(list);
    }

    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all){

        List<CategoryEntity> childrens = all.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid() == root.getCatId();
        }).map(categoryEntity -> {
            categoryEntity.setChildren(getChildren(categoryEntity, all));
            return categoryEntity;
        }).sorted((menu1, menu2)->{
            return (menu1.getSort() == null? 0: menu1.getSort())-(menu2.getSort() == null? 0: menu2.getSort());
        }).collect(Collectors.toList());

        return childrens;

    }

}