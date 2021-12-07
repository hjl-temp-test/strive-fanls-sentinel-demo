package com.bc.demo.goods.api;

import com.bc.demo.constant.api.R;
import com.bc.demo.goods.response.GoodsDTO;

/**
 * @author fanlinsheng
 * @version 1.0.0
 * @date 2021年12月07日 15:59:00
 * 商品Api
 */
public interface GoodsApi {

    R<GoodsDTO> findByGoodsCode(String goodsCode);

}
