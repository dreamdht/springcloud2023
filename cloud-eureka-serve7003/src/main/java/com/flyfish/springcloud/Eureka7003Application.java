package com.flyfish.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @autohr flyfish
 * @date: 2023/2/10 15:24
 * @description:
 */

@SpringBootApplication
@Slf4j
@EnableEurekaServer
public class Eureka7003Application {
    public static void main(String[] args) {
        log.info("7003端口Eureka服务已被启动");
        SpringApplication.run(Eureka7003Application.class,args);
    }
}
