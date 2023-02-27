package com.flyfish.alibaba;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @autohr flyfish
 * @date: 2023/2/27 16:06
 * @description:
 */
@Slf4j
@SpringBootApplication
@EnableFeignClients
public class AlibabaOrder80Application {
    public static void main(String[] args) {
        log.info("nacos80消费者端已启动");
        SpringApplication.run(AlibabaOrder80Application.class,args);
    }
}
