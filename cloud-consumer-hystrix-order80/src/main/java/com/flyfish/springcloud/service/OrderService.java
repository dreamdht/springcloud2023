package com.flyfish.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @autohr flyfish
 * @date: 2023/2/15 20:42
 * @description:
 * @Bug: A component required a bean of type 'com.flyfish.springcloud.service.OrderService' that could not be found.
 */

@FeignClient(value = "CLOUD-HYSTRIX-PAYMENT-SERVICE")
@Component
public interface OrderService {

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentOk(@PathVariable("id") Integer id);

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentTimeout(@PathVariable("id") Integer id);
}
