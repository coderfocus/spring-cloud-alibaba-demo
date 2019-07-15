package com.coderfocus.spring.cloud.alibaba.nacos.provider.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NacosProviderController {

    @GetMapping("/echo/{message}")
    public String echo(@PathVariable(value = "message") String message){
        return "Hello Nacos " + message;
    }
}
