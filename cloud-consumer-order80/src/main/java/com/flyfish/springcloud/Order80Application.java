package com.flyfish.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @autohr flyfish
 * @date: 2023/2/9 16:14
 * @description:
 */

@EnableTransactionManagement
@EnableEurekaClient
@MapperScan("com.flyfish.springcloud.mapper")
@Slf4j
@SpringBootApplication
public class Order80Application {
    public static void main(String[] args) {
        log.info("80项目已启动");
        SpringApplication.run(Order80Application.class,args);
    }
}
