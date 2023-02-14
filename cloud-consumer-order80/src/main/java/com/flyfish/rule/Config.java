package com.flyfish.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @autohr flyfish
 * @date: 2023/2/14 19:14
 * @description:
 */

@Configuration
public class Config {
    @Bean
    public IRule swapRule(){
        return new RandomRule();
    }
}
