package com.flyfish.springcloud.controller;

import com.flyfish.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @autohr flyfish
 * @date: 2023/2/15 19:48
 * @description:
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    private String serverPort = "8004";


    @GetMapping("/hystrix/ok/{id}")
    public String paymentOk(@PathVariable("id") Integer id){
        return paymentService.paymentOk(id);
    }

    @GetMapping("/hystrix/timeout/{id}")
    public String paymentTimeout(@PathVariable("id") Integer id){
        return paymentService.paymentTimeout(id);
    }

}
