package com.bc.demo.provider.service;

import cn.hutool.core.date.DateUtil;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.bc.demo.provider.api.HelloService;
import com.bc.demo.provider.fallback.HelloFallback;
import com.bc.demo.provider.handler.BlockHandler;
import org.apache.dubbo.config.annotation.DubboService;

import java.time.LocalDateTime;

import static com.bc.demo.constant.AppConstant.DUBBO_SERVICE_VERSION;

/**
 * @author fanlinsheng
 * @version 1.0.0
 * @date 2021年12月07日 19:56:00
 */
@DubboService(version = DUBBO_SERVICE_VERSION)
public class HelloServiceImpl implements HelloService {

    @SentinelResource(value = "sayHello",
            blockHandlerClass = BlockHandler.class,
            blockHandler = "allHandlerException",
            fallbackClass = HelloFallback.class,
            fallback = "sayHello"
    )
    @Override
    public String sayHello(String name) {
        if (System.currentTimeMillis() % 2 == 0) {
            throw new RuntimeException("系统异常了");
        }
        return String.format("Hello, %s at %s", name, DateUtil.formatLocalDateTime(LocalDateTime.now()));
    }

    @Override
    public String test() {
        return "Hello Sentinel";
    }
}
