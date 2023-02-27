package com.flyfish.alibaba;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @autohr flyfish
 * @date: 2023/2/27 17:28
 * @description:
 */
@EnableDiscoveryClient
@SpringBootApplication
@Slf4j
public class CenterConfig2000Application {
    public static void main(String[] args) {
        log.info("2000配置中心端口已启动");
        SpringApplication.run(CenterConfig2000Application.class,args);
    }
}
