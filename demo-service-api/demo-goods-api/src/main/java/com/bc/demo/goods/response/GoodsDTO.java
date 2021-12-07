package com.bc.demo.goods.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author fanlinsheng
 * @version 1.0.0
 * @date 2021年12月07日 16:03:00
 * 商品信息
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GoodsDTO implements Serializable {
    private static final long serialVersionUID = 7676030800194747448L;
    private Long id;
    private String goodsCode;
    private String goodsName;
    private String goodsDesc;
}
