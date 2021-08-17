package com.xue.client.fallback;

import org.springframework.stereotype.Component;

@Component
public class ProductFallbackFeinService {

    public String product(Integer id) {
        return "服务异常";
    }

}
