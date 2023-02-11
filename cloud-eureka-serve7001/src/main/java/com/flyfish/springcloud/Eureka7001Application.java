package com.flyfish.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @autohr flyfish
 * @date: 2023/2/9 22:07
 * @description:
 */


@SpringBootApplication
@EnableEurekaServer//开启EurekaServer
@Slf4j
public class Eureka7001Application {
    public static void main(String[] args) {
        log.info("7001端口,eureka已启动");
        SpringApplication.run(Eureka7001Application.class,args);
    }
}
