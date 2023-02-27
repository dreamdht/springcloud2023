package com.flyfish.springcloud.controller;

import com.flyfish.springcloud.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @autohr flyfish
 * @date: 2023/2/23 22:05
 * @description:
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    @Autowired
    private ConsumerService consumerService;

    @RequestMapping("/payment/send")
    public String getMsg(){
        return consumerService.getMsg();
    }
}
