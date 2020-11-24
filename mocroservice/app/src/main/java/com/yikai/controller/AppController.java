package com.yikai.controller;

import com.yikai.service1.api.ConsumerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Tips
 * @Author yikai.wang
 * @Number K1171305
 * @Date 2020/11/24 16:53
 */
@RestController
public class AppController {

    @org.apache.dubbo.config.annotation.Reference
    ConsumerService consumerService;

    @GetMapping("/hello")
    public String hello(){
        String hello = consumerService.service();
        return "this is from app's controller :  result is -  " + hello;
    }
}
