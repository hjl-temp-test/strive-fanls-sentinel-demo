package com.bc.demo.provider.service;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.fastjson.JSONObject;
import com.bc.demo.constant.AppConstant;
import com.bc.demo.provider.api.HelloService;
import com.bc.demo.provider.handler.HelloBlockHandler;
import com.bc.demo.provider.request.HelloRequest;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

/**
 * @author fanlinsheng
 * @version 1.0.0
 * @date 2021年12月07日 19:56:00
 */
@Slf4j
@DubboService(version = AppConstant.DUBBO_SERVICE_VERSION)
public class HelloServiceImpl implements HelloService {

    @SneakyThrows
    @SentinelResource(value = "sayHello"
            , blockHandlerClass = HelloBlockHandler.class
            , blockHandler = "sayHelloBlockHandler"
    )
    @Override
    public String sayHello(String name) {
        log.info("请求了 com.bc.demo.provider.service.HelloServiceImpl.sayHello");
        if(StrUtil.equalsIgnoreCase(name, "Sentinel")){
            TimeUnit.MILLISECONDS.sleep(200);
        }else{
            TimeUnit.MILLISECONDS.sleep(300);
        }
//        TimeUnit.MILLISECONDS.sleep(200);
        return String.format("Hello, %s at %s", name, DateUtil.formatLocalDateTime(LocalDateTime.now()));
    }

    @SentinelResource(value = "hotParams"
            , blockHandlerClass = HelloBlockHandler.class
            , blockHandler = "hotParamsBlockHandler"
    )
    @Override
    public String hotParams(HelloRequest request) {
        return JSONObject.toJSONString(request);
    }

}
