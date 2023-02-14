package com.flyfish.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @autohr flyfish
 * @date: 2023/2/14 22:10
 * @description: 开启feign日志
 */

@Configuration
public class FeignLogConfig {
    @Bean
    Logger.Level feignLog(){
        return Logger.Level.FULL;
    }
}
