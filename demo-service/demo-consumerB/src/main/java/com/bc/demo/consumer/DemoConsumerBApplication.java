package com.bc.demo.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDubbo
@SpringBootApplication
@EnableDiscoveryClient
public class DemoConsumerBApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoConsumerBApplication.class, args);
    }

}
