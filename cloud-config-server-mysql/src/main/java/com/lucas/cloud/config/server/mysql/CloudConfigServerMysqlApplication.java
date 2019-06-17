package com.lucas.cloud.config.server.mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Lucas
 */
@SpringBootApplication
@EnableConfigServer
public class CloudConfigServerMysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConfigServerMysqlApplication.class, args);
    }

}
