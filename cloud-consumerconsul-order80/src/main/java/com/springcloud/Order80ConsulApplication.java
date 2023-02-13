package com.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @autohr flyfish
 * @date: 2023/2/13 21:06
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class Order80ConsulApplication {
    public static void main(String[] args) {
        log.info("80服务端口已启动");
        SpringApplication.run(Order80ConsulApplication.class,args);
    }
}
