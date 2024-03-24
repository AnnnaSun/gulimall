package com.community.gulimall.product;

import com.community.gulimall.product.entity.BrandEntity;
import com.community.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest()
public class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("huawei");
//        brandEntity.setDescript("test");
//        brandEntity.setName("testname");
//        brandService.save(brandEntity);
        brandService.updateById(brandEntity);
        System.out.println("save successfully");

    }

}
