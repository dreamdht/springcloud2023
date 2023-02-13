package com.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @autohr flyfish
 * @date: 2023/2/13 20:29
 * @description:
 */

@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class Payment8006ConsulApplication {
    public static void main(String[] args) {
        log.info("8006端口服务已启动");
        SpringApplication.run(Payment8006ConsulApplication.class,args);
    }
}
