package com.yikai.controller;

import com.yikai.client.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Tips
 * @Author yikai.wang
 * @Number K1171305
 * @Date 2020/11/17 15:48
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    private static int n = 0;

    @Autowired
    private ProviderClient providerClient;

    @GetMapping("/hello")
    public String hello(){
        n++;
        return "consumer is invoke " + providerClient.hello() + "   no." + n;
    }
}
