package com.bc.demo.provider.service;

import com.bc.demo.provider.api.HelloService;
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
    @Override
    public String sayHello(String name) {
        return String.format("Hello, %s at %s", name, LocalDateTime.now());
    }
}
