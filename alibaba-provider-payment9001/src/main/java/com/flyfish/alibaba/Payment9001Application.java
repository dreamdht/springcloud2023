package com.flyfish.alibaba;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @autohr flyfish
 * @date: 2023/2/27 15:06
 * @description:
 */
@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
public class Payment9001Application {
    public static void main(String[] args) {
        log.info("9001SpringCloudAlibaba端口已启动");
        SpringApplication.run(Payment9001Application.class,args);
    }
}
