package com.xue.client.fallback;

import com.xue.client.ProductClient;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceFallbackFactory implements FallbackFactory<ProductClient> {
    @Override
    public ProductClient create(Throwable throwable) {
        return new ProductClient() {
            @Override
            public String product(Integer id) {
                return "服务异常";
            }
        };
    }
}
