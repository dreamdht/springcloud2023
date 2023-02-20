package com.flyfish.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @autohr flyfish
 * @date: 2023/2/20 20:48
 * @description:
 */
@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
@Slf4j
public class CenterConfigServer2000 {
    public static void main(String[] args) {
        log.info("2000 has been stater........");
        SpringApplication.run(CenterConfigServer2000.class,args);
    }
}
