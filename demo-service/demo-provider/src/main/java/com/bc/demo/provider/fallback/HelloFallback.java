package com.bc.demo.provider.fallback;

public class HelloFallback {

    public static String sayHello(String name, Throwable e) {
        return "sayHello 异常熔断降级了";
    }

}
