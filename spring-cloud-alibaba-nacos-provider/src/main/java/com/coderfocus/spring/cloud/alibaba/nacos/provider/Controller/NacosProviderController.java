package com.coderfocus.spring.cloud.alibaba.nacos.provider.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.executable.ValidateOnExecution;

@RestController
public class NacosProviderController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/echo/{message}")
    public String echo(@PathVariable(value = "message") String message){
        return "Hello Nacos " + message + " i am from port " + port;
    }
}
