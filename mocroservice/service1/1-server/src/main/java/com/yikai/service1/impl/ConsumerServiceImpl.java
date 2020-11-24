package com.yikai.service1.impl;

import com.yikai.servervice2.api.ProviderService;
import com.yikai.service1.api.ConsumerService;

/**
 * @Description
 * @Tips
 * @Author yikai.wang
 * @Number K1171305
 * @Date 2020/11/24 16:16
 */
@org.apache.dubbo.config.annotation.Service
public class ConsumerServiceImpl implements ConsumerService {
    //注入service
    @org.apache.dubbo.config.annotation.Reference
    ProviderService providerService;
    //dubbo接口实现内容
    public String service() {
        //远程调用
        String service = providerService.provider();
        return "Consumer invoke |  " + service ;
    }
}
