package com.yikai.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description
 * @Tips
 * @Author yikai.wang
 * @Number K1171305
 * @Date 2020/11/17 15:46
 */
@FeignClient(value = "quickstart-provider")
public interface ProviderClient {
    @GetMapping("/hello")
    String hello();
}
