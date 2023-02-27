package com.flyfish.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @autohr flyfish
 * @date: 2023/2/23 13:25
 * @description:
 */
@SpringBootApplication
@EnableEurekaClient
@Slf4j
public class MqProvider5000Application {
    public static void main(String[] args) {
        log.info("5000消息生产者队列已启动...");
        SpringApplication.run(MqProvider5000Application.class,args);
    }
}
