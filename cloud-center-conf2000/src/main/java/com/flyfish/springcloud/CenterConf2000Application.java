package com.flyfish.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @autohr flyfish
 * @date: 2023/2/18 19:49
 * @description:
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class CenterConf2000Application {
    public static void main(String[] args) {
        SpringApplication.run(CenterConf2000Application.class,args);
    }
}
