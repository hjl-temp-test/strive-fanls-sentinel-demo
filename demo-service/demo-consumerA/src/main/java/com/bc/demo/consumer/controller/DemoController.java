package com.bc.demo.consumer.controller;

import com.bc.demo.provider.api.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.bc.demo.constant.AppConstant.DUBBO_SERVICE_VERSION;

/**
 * @author fanlinsheng
 * @version 1.0.0
 * @date 2021年12月07日 20:24:00
 * demo
 */
@RestController
public class DemoController {

    @DubboReference(version = DUBBO_SERVICE_VERSION)
    private HelloService helloService;

    @GetMapping("hello")
    public String sayHello(String name) {
        return helloService.sayHello(name);
    }

}
