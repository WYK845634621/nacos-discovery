package com.yikai.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Tips
 * @Author yikai.wang
 * @Number K1171305
 * @Date 2020/11/17 15:39
 */
@RestController
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    private static int n = 0;

    @Value("${server.port}")
    private int port;

    @GetMapping("/hello")
    public String hello(){
        n++;
        logger.info("provider is invoked......port is " + port + "   no." + n);
        return "this is from port: " + port;
    }
}
