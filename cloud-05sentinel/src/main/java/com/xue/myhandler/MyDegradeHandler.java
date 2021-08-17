package com.xue.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

public class MyDegradeHandler {

    public static String handlerException(BlockException e) {
        return "服务降级:" + e.getMessage();
    }
}
