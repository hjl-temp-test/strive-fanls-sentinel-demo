package com.bc.demo.provider.api;

import com.bc.demo.provider.request.HelloRequest;

/**
 * @author fanlinsheng
 * @version 1.0.0
 * @date 2021年12月07日 15:59:00
 */
public interface HelloService {

    String sayHello(String name);

    String hotParams(HelloRequest request);
}
