package com.flyfish.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @autohr flyfish
 * @date: 2023/2/23 22:01
 * @description:
 */
@SpringBootApplication
@Slf4j
@EnableEurekaClient
@EnableFeignClients
public class SleuthConsumer80Application {
    public static void main(String[] args) {
        log.info("80Sleuth消费者端已启动");
        SpringApplication.run(SleuthConsumer80Application.class,args);
    }
}
