package com.flyfish.springcloud.controller;

import com.flyfish.springcloud.common.R;
import com.flyfish.springcloud.pojo.Payment;
import com.flyfish.springcloud.service.OrderService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @autohr flyfish
 * @date: 2023/2/14 20:27
 * @description:
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Resource
    private OrderService orderService;

    @PostMapping("/payment/getById")
    R getPaymentById(@RequestBody @Validated Payment paymentParam){
        return orderService.getPaymentById(paymentParam);
    };

    @GetMapping("/payment/getAll")
    List<Payment> getAllPayment(){
        return orderService.getAllPayment();
    }

    @GetMapping("/payment/outTime")
    public String makeTimeOut(){
        String timeOutError = orderService.getTimeOutError();
        return timeOutError;
    }

    @GetMapping("/payment/server")
    public String getServer(){
        return orderService.getServer();
    }
}
