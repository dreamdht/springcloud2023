package com.flyfish.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @autohr flyfish
 * @date: 2023/2/15 19:44
 * @description:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@Slf4j
public class HystrixPayment8004Application {
    public static void main(String[] args) {
        log.info("8004-Hystrix端已启动");
        SpringApplication.run(HystrixPayment8004Application.class,args);
    }
}
