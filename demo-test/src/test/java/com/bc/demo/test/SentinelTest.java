package com.bc.demo.test;

import cn.hutool.core.lang.Console;
import cn.hutool.core.thread.ConcurrencyTester;
import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.http.HttpUtil;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author fanlinsheng
 * @version 1.0.0
 * @date 2021年12月10日 15:43:00
 */
@SpringBootTest
public class SentinelTest {

    @Test
    public void test(){
        ConcurrencyTester tester = ThreadUtil.concurrencyTest(100, () -> {
            Console.log("=======");
            // 测试的逻辑内容
            Console.log(HttpUtil.get("http://localhost:10010/hello/pingpong"));
        });
    }

}
