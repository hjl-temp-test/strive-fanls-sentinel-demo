package com.bc.demo.consumer.controller;

import com.bc.demo.constant.AppConstant;
import com.bc.demo.provider.api.HelloService;
import lombok.SneakyThrows;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author fanlinsheng
 * @version 1.0.0
 * @date 2021年12月07日 20:24:00
 * demo
 */
@RestController
public class DemoController {

    @DubboReference(version = AppConstant.DUBBO_SERVICE_VERSION)
    private HelloService helloService;

    @SneakyThrows
    @GetMapping("hello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        TimeUnit.MILLISECONDS.sleep(500);
        return helloService.sayHello(name);
    }

    @GetMapping("test")
    public String test() {
//        return helloService.test();
        return "Hello Sentinel";
    }

    @GetMapping("demo")
    public String demo() {
        return "Sentinel Demo";
    }

}
