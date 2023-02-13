package com.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @autohr flyfish
 * @date: 2023/2/13 21:09
 * @description:
 */

@RestController
@RequestMapping("/consumer")
public class OrderController {
    public static final String URL = "http://cloud-payment8006-service";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consul")
    public String paymentInfo(){
        String result = restTemplate.getForObject(URL+"/payment/consul",String.class);
        return result;
    }
}
