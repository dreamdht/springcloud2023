package com.flyfish.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @autohr flyfish
 * @date: 2023/2/20 21:26
 * @description:
 */
@SpringBootApplication
@EnableEurekaClient
public class Config2100Application {
    public static void main(String[] args) {
        SpringApplication.run(Config2100Application.class,args);
    }
}
