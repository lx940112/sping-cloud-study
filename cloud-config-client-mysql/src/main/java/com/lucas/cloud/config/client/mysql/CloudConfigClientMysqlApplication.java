package com.lucas.cloud.config.client.mysql;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lucas
 */
@SpringBootApplication
@RestController
public class CloudConfigClientMysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConfigClientMysqlApplication.class, args);
    }

    @Value("${foo}")
    String foo;
    @RequestMapping(value = "/foo")
    public String hi(){
        return foo;
    }
}
