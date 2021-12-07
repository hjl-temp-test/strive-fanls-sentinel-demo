package com.bc.demo.order.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author fanlinsheng
 * @version 1.0.0
 * @date 2021年12月07日 17:56:00
 * 订单信息
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO implements Serializable {
    private static final long serialVersionUID = 4926983876822012776L;
    private Long id;
    private String orderCode;
    private String orderDesc;
    private String goodsName;
    private String goodsDesc;
    private String order;
}
