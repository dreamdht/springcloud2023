package com.springcloud.controller;

import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @autohr flyfish
 * @date: 2023/2/13 20:30
 * @description:
 */

@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {
    private String serverPort = "8006";

    @RequestMapping("/consul")
    public String paymentConsul(){
        return "springcloud with consul: "+serverPort+"\t"+ UUID.randomUUID().toString() ;
    }
}
