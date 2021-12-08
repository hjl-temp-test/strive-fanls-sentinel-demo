package com.bc.demo.consumer;

import cn.hutool.core.lang.Console;
import cn.hutool.core.thread.ConcurrencyTester;
import cn.hutool.core.thread.ThreadUtil;
import com.bc.demo.consumer.controller.DemoController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class SentinelTest {

    @Resource
    private DemoController demoController;

    @Test
    public void test(){
        ConcurrencyTester tester = ThreadUtil.concurrencyTest(100, () -> {
            // 测试的逻辑内容
            Console.log(demoController.demo());
        });
    }

}
