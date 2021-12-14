package com.bc.demo.test;

import cn.hutool.core.lang.Console;
import cn.hutool.core.thread.ConcurrencyTester;
import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSONObject;
import lombok.SneakyThrows;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;

/**
 * @author fanlinsheng
 * @version 1.0.0
 * @date 2021年12月10日 15:43:00
 */
@SpringBootTest
public class SentinelTest {

    @SneakyThrows
    @Test
    public void test(){
        while(true){
            ConcurrencyTester tester = ThreadUtil.concurrencyTest(20, () -> {
                // 测试的逻辑内容
                Console.log(HttpUtil.get("http://localhost:10010/hello/pingpong"));
            });
        }

//        TimeUnit.MINUTES.sleep(5);
    }

    @Test
    public void test1(){
        ConcurrencyTester tester = ThreadUtil.concurrencyTest(100, () -> {
            try {
                TimeUnit.SECONDS.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

    @Test
    public void hotParams(){
        ConcurrencyTester tester = ThreadUtil.concurrencyTest(10, () -> {
            JSONObject helloJson = new JSONObject();
            helloJson.put("name", "张三");
            helloJson.put("age", 18);
            JSONObject addressJson = new JSONObject();
            addressJson.put("province", "浙江省");
            addressJson.put("city", "杭州市");
            addressJson.put("district", "滨江区");
            helloJson.put("address", addressJson);
            // 测试的逻辑内容
            Console.log(HttpUtil.post("http://localhost:10010/hot/params", helloJson.toJSONString()));
        });
    }
}
