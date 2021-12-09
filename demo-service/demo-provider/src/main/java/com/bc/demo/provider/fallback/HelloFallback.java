package com.bc.demo.provider.fallback;

public class HelloFallback {

    public static String sayHello(String name, Throwable e) {
        return "出现异常了：Fallback";
    }

}
