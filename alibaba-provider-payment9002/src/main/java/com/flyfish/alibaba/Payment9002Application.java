package com.flyfish.alibaba;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @autohr flyfish
 * @date: 2023/2/27 15:47
 * @description:
 */
@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
public class Payment9002Application {
    public static void main(String[] args) {
        log.info("9002 nacos 端口已启动...");
        SpringApplication.run(Payment9002Application.class,args);
    }
}
