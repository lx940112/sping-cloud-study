package com.lucas.cloudribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Lucas
 */
@Service
public class HelloWorldService {


    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://eureka-client/hi?name="+name,String.class);
    }

}
