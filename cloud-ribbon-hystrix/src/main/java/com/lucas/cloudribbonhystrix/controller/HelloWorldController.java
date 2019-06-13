package com.lucas.cloudribbonhystrix.controller;

import com.lucas.cloudribbonhystrix.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lucas
 */
@RestController
public class HelloWorldController {


    @Autowired
    HelloWorldService helloWorldService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloWorldService.hiService(name);
    }
}
