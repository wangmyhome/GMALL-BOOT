package com.wang.gmall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wang.gmall.product.entity.BrandEntity;
import com.wang.gmall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GmallProductApplicationTests {

    @Autowired
    private BrandService brandService;
    @Test
    void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
        //brandEntity.setBrandId(2L);
//        for (int i = 0; i < 10; i++){
//            brandEntity.setName("手机"+i);
//            brandService.save(brandEntity);
//            System.out.println("保存成功"+i);
//        }



       // brandService.updateById(brandEntity);

        List<BrandEntity> brand_list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", "2L"));
        brand_list.forEach((item)->{
            System.out.println(item);
        });
    }

}
