package com.bc.demo.provider.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.bc.demo.constant.AppConstant;
import com.bc.demo.provider.api.OrderService;
import com.bc.demo.provider.handler.BlockHandler;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.concurrent.TimeUnit;

@Slf4j
@DubboService(version = AppConstant.DUBBO_SERVICE_VERSION)
public class OrderServiceImpl implements OrderService {

    @SentinelResource(value = "create"
            , blockHandlerClass = BlockHandler.class
            , blockHandler = "allHandlerException"
    )
    @SneakyThrows
    @Override
    public String create() {
        TimeUnit.MILLISECONDS.sleep(200);
        return "创建订单成功";
    }

    @SentinelResource(value = "pay"
            , blockHandlerClass = BlockHandler.class
            , blockHandler = "allHandlerException"
    )
    @SneakyThrows
    @Override
    public String pay() {
        TimeUnit.MILLISECONDS.sleep(200);
        return "支付成功";
    }
}
