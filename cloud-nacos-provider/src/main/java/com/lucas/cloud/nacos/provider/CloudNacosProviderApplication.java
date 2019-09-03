package com.lucas.cloud.nacos.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Lucas
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudNacosProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudNacosProviderApplication.class, args);
    }

}
