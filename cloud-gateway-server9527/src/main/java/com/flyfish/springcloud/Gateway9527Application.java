package com.flyfish.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @autohr flyfish
 * @date: 2023/2/18 14:54
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Gateway9527Application {
    public static void main(String[] args) {
        SpringApplication.run(Gateway9527Application.class,args);
    }
}
