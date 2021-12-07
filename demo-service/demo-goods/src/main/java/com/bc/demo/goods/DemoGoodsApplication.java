package com.bc.demo.goods;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDubbo
@SpringBootApplication
@EnableDiscoveryClient
public class DemoGoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoGoodsApplication.class, args);
    }

}
