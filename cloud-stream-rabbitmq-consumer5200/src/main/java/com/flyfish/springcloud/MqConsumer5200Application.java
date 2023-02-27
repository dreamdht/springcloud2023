package com.flyfish.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @autohr flyfish
 * @date: 2023/2/23 15:46
 * @description:
 */
@SpringBootApplication
@Slf4j
@EnableEurekaClient
public class MqConsumer5200Application {
    public static void main(String[] args) {
        log.info("5200消息队列消费者端口已启动...");
        SpringApplication.run(MqConsumer5200Application.class,args);
    }
}
