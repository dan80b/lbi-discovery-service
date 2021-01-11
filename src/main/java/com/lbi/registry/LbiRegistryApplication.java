package com.lbi.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LbiRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(LbiRegistryApplication.class, args);
    }

}
