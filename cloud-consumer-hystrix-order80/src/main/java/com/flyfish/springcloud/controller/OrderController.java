package com.flyfish.springcloud.controller;

import com.flyfish.springcloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @autohr flyfish
 * @date: 2023/2/15 20:45
 * @description:
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("/hystrix/ok/{id}")
    public String paymentOk(@PathVariable("id") Integer id){
        return orderService.paymentOk(id)+"BBA";
    }

    @GetMapping("/hystrix/timeout/{id}")
    public String paymentTimeout(@PathVariable("id") Integer id){
        return orderService.paymentTimeout(id);
    }
}
