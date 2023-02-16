package com.flyfish.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @autohr flyfish
 * @date: 2023/2/10 15:22
 * @description:
 */

@SpringBootApplication
@EnableEurekaServer
@Slf4j
public class Eureka7002Application {
    public static void main(String[] args) {
        log.info("7002端口Eureka注册中心已启动");
        SpringApplication.run(Eureka7002Application.class,args);
    }
}
