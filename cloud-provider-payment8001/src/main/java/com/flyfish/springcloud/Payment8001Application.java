package com.flyfish.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @autohr flyfish
 * @date: 2023/2/8 20:18
 * @description:
 */


@EnableTransactionManagement
@MapperScan("com.flyfish.springcloud.mapper")
@SpringBootApplication
@Slf4j
@EnableEurekaClient
public class Payment8001Application {
    public static void main(String[] args) {
        log.info("8081项目已启动");
        SpringApplication.run(Payment8001Application.class, args);
    }
}
