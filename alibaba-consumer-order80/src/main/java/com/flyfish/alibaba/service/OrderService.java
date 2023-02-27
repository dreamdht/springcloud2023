package com.flyfish.alibaba.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @autohr flyfish
 * @date: 2023/2/27 16:11
 * @description:
 */
@FeignClient(value = "alibaba-nacos-provider9001")
@Service
public interface OrderService {
    @GetMapping("/payment/sendMsg")
    String sendMsg();
}
