package com.xue.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("PRODUCT")
public interface ProductClient {

    @GetMapping("/product")
    String product(@RequestParam Integer id);
}
