package com.flyfish.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @autohr flyfish
 * @date: 2023/2/23 21:50
 * @description:
 */
@SpringBootApplication
@Slf4j
@EnableEurekaClient
public class SleuthPayment8005Application {
    public static void main(String[] args) {
        log.info("8005端口Sleuth生产者已启用");
        SpringApplication.run(SleuthPayment8005Application.class,args);
    }
}
