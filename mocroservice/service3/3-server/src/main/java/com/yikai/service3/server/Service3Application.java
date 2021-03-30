package com.yikai.service3.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description
 * @Tips
 * @Author yikai.wang
 * @Number K1171305
 * @Date 2020/12/4 10:19
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Service3Application {
    public static void main(String[] args) {
        SpringApplication.run(Service3Application.class,args);
    }
}
