package com.xue.client;

import com.xue.client.fallback.ProductFallbackFeinService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "PRODUCT", fallback = ProductFallbackFeinService.class)
public interface ProductClient {

    @GetMapping("/product")
    String product(Integer id);

}
