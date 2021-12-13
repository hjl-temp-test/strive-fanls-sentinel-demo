package com.bc.demo.consumer.controller;

import com.bc.demo.constant.AppConstant;
import com.bc.demo.provider.api.HelloService;
import com.bc.demo.provider.api.OrderService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fanlinsheng
 * @version 1.0.0
 * @date 2021年12月09日 18:00:00
 */
@RestController
public class DemoController {

    @DubboReference(version = AppConstant.DUBBO_SERVICE_VERSION)
    private HelloService helloService;

    @DubboReference(version = AppConstant.DUBBO_SERVICE_VERSION)
    private OrderService orderService;

    @GetMapping("hello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return helloService.sayHello(name);
    }

    @GetMapping("test")
    public String test() {
        return helloService.test();
//        return "Hello Sentinel";
    }

    @GetMapping("demo")
    public String demo() {
        return "Sentinel Demo";
    }


    @GetMapping("create")
    public String create() {
        return orderService.create();
    }

    @GetMapping("pay")
    public String pay() {
        return orderService.pay();
    }

}
