package com.xue.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeException;
import com.alibaba.csp.sentinel.slots.block.flow.FlowException;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowException;
import com.xue.myhandler.MyDegradeHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class DemoController {

    private static final Logger log = LoggerFactory.getLogger(DemoController.class);


    @GetMapping("/test")
    @SentinelResource(value = "rateLimit", blockHandlerClass = MyDegradeHandler.class, blockHandler = "handlerException")
    public String test(Integer id) {
        return "demo id:" + id;
    }

    @GetMapping("/demo")
    @SentinelResource(value = "demoParamLimit", blockHandler = "blockHandler", fallback = "fall")
    public String demo(Integer id) {
        return "demo id:" + id;
    }

    public String blockHandler(Integer id, BlockException e) {
        if (e instanceof FlowException) {
            return "请求过于火爆，当前已经被限流";
        }
        if (e instanceof DegradeException) {
            return "请求过于火爆，服务已经进行降级";
        }
        if (e instanceof ParamFlowException) {
            return "请求过于火爆，参数已经限流";
        }
        return "服务器异常，请稍后访问";
    }

    public String fall(Integer id) {
        return "当前服务异常，不可用";
    }
}
