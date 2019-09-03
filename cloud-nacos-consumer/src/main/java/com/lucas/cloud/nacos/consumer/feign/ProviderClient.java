package com.lucas.cloud.nacos.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Lucas
 */
@FeignClient("nacos-provider")
public interface ProviderClient {

    /**
     * 测试方法
     */
    @GetMapping("/hi")
    String hi(@RequestParam(value = "name", defaultValue = "lucas", required = false) String name);
}
