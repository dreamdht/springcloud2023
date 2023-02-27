package com.flyfish.alibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @autohr flyfish
 * @date: 2023/2/27 15:48
 * @description:
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/sendMsg")
    public String getMsg(){
        return "IP"+port+"\t:"+ UUID.randomUUID().toString();
    }
}
