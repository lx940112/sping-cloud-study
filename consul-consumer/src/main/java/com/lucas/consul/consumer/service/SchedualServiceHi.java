package com.lucas.consul.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @author Lucas
 */
@FeignClient(value = "consul-provider")
public interface SchedualServiceHi {

    /**
     * 从任一客户端获取
     * @param name 传递的参数
     * @return  返回的字符串
     */
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}