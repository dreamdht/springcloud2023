package com.flyfish.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @autohr flyfish
 * @date: 2023/2/23 22:03
 * @description:
 */
@FeignClient(value = "CLOUD-SLEUTH-PAYMENT8005")
@Service
public interface ConsumerService {
    @RequestMapping("/payment/send")
    public String getMsg();
}
