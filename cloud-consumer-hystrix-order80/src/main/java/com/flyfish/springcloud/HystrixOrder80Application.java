package com.flyfish.springcloud;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @autohr flyfish
 * @date: 2023/2/15 20:41
 * @description:
 */
@SpringBootApplication
@Slf4j
@EnableFeignClients
public class HystrixOrder80Application {
    public static void main(String[] args) {
        log.info("Hystrix-80消费者端已启动");
        SpringApplication.run(HystrixOrder80Application.class,args);
    }
}
