package com.bc.demo.provider.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

public class BlockHandler {

    public static String allHandlerException(BlockException exception) {
        return "系统繁忙，请稍后重试!";
    }

}
