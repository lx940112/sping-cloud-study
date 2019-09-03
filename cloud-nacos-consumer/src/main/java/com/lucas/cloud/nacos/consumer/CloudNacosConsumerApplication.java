package com.lucas.cloud.nacos.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Lucas
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CloudNacosConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudNacosConsumerApplication.class, args);
    }

}
