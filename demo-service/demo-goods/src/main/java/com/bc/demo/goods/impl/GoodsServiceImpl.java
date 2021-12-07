package com.bc.demo.goods.impl;

import com.bc.demo.constant.AppConstant;
import com.bc.demo.constant.api.R;
import com.bc.demo.goods.api.GoodsApi;
import com.bc.demo.goods.response.GoodsDTO;
import org.apache.dubbo.config.annotation.DubboService;

import java.math.BigDecimal;

/**
 * @author fanlinsheng
 * @version 1.0.0
 * @date 2021年12月07日 16:24:00
 * 商品服务实现
 */
@DubboService(version = AppConstant.DUBBO_SERVICE_VERSION)
public class GoodsServiceImpl implements GoodsApi {
    @Override
    public R<GoodsDTO> findByGoodsCode(String goodsCode) {
        GoodsDTO goodsDTO = GoodsDTO.builder()
                .id(1L)
                .goodsCode("G00001")
                .goodsPrice(new BigDecimal("5999"))
                .goodsName("iPhone 13")
                .goodsDesc("Apple iPhone 13 (A2634) 128GB 蓝色 支持移动联通电信5G 双卡双待手机")
                .build();
        return R.data(goodsDTO);
    }
}
