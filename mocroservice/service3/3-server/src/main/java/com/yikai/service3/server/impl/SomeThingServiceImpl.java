package com.yikai.service3.server.impl;

import com.yikai.service3.api.SomeThingService;
import org.springframework.beans.factory.annotation.Value;

/**
 * @Description
 * @Tips
 * @Author yikai.wang
 * @Number K1171305
 * @Date 2020/12/4 10:16
 */
@org.apache.dubbo.config.annotation.Service
public class SomeThingServiceImpl implements SomeThingService {
    @Value("${server.port}")
    private int port;
    public String something() {
        return "这里是something service, port: " + port;
    }


}
