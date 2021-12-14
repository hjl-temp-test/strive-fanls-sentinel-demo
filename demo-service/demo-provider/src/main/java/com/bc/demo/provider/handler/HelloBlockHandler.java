package com.bc.demo.provider.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.bc.demo.provider.request.HelloRequest;

/**
 * @author fanlinsheng
 * @version 1.0.0
 * @date 2021年12月14日 16:24:00
 */
public class HelloBlockHandler {

    public static String sayHelloBlockHandler(String name, BlockException exception) {
        return "系统繁忙，请稍后重试！";
    }

    public static String hotParamsBlockHandler(HelloRequest request, BlockException exception) {
        return "系统繁忙，请稍后重试！";
    }
}
