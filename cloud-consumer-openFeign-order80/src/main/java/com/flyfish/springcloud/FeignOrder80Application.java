package com.flyfish.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @autohr flyfish
 * @date: 2023/2/14 20:20
 * @description:
 */

@EnableFeignClients
@EnableTransactionManagement
@EnableEurekaClient
@Slf4j
@SpringBootApplication
public class FeignOrder80Application {
    public static void main(String[] args) {
        log.info("openFeign80消费端已启动");
        SpringApplication.run(FeignOrder80Application.class,args);
    }
}
