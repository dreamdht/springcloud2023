package com.flyfish.alibaba.controller;

import com.flyfish.alibaba.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @autohr flyfish
 * @date: 2023/2/27 16:12
 * @description:
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/getMsg")
    public String getMsg(){
        return orderService.sendMsg();
    }
}
