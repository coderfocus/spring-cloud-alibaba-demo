package com.coderfocus.spring.cloud.alibaba.nacos.consumer.feign.service;

import com.coderfocus.spring.cloud.alibaba.nacos.consumer.feign.service.fallback.EchoServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "nacos-provider",fallback = EchoServiceFallback.class) //指定调用哪个服务
public interface EchoService {

    @GetMapping("/echo/{message}")
    String echo(@PathVariable("message") String message);
}
