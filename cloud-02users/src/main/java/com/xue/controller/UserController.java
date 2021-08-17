package com.xue.controller;

import com.xue.client.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class UserController {
    //    @Autowired
//    private DiscoveryClient discoveryClient;
//    @Autowired
//    private LoadBalancerClient loadBalancerClient;
//    @Autowired
//    private RestTemplate restTemplate;
    @Autowired
    private ProductClient productClient;

    @GetMapping("invokeProduct")
    public String invokeProduct() {
        //http
//        String result = new RestTemplate().getForObject("http://localhost:8803/product?id=21", String.class);

        //discoveryClient
//        List<ServiceInstance> products = discoveryClient.getInstances("PRODUCT");
//        for (ServiceInstance product : products) {
//
//
//        }
        //loadBalancerClient
//        ServiceInstance product = loadBalancerClient.choose("PRODUCT");
//        String result = new RestTemplate().getForObject(product.getUri() + "/product?id=21", String.class);

        //@LoadBalance注解
//        String result = this.restTemplate.getForObject("http://PRODUCT/product?id=21", String.class);

        //openFein
        String result = productClient.product(21);
        return result;
    }

}
