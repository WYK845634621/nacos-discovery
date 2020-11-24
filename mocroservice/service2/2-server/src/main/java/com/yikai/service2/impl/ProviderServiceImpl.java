package com.yikai.service2.impl;

import com.yikai.servervice2.api.ProviderService;

/**
 * @Description
 * @Tips
 * @Author yikai.wang
 * @Number K1171305
 * @Date 2020/11/24 16:23
 */
@org.apache.dubbo.config.annotation.Service
public class ProviderServiceImpl implements ProviderService {
    public String provider() {
        return "ProviderServiceImpl is invoked...";
    }
}
