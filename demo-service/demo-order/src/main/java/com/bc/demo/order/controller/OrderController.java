package com.bc.demo.order.controller;

import com.bc.demo.constant.api.R;
import com.bc.demo.goods.api.GoodsApi;
import com.bc.demo.goods.response.GoodsDTO;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fanlinsheng
 * @version 1.0.0
 * @date 2021年12月07日 16:45:00
 * 订单
 */
@RestController
public class OrderController {

    @DubboReference
    private GoodsApi goodsApi;

    @GetMapping("test")
    public R list() {
        R<GoodsDTO> r = goodsApi.findByGoodsCode("G000001");
        return R.success(r.getMsg());
    }

}
