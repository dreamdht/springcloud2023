package com.flyfish.springcloud.controller;

import com.flyfish.springcloud.common.R;
import com.flyfish.springcloud.pojo.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


import javax.annotation.Resource;
import java.util.List;

/**
 * @autohr flyfish
 * @date: 2023/2/9 18:39
 * @description:
 */
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {
    public static final String URL = "http://localhost:8001";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/payment/getAllPayment")
    public List<Payment> getAll(){
        return restTemplate.getForObject(URL + "/payment/getAll", List.class);
    }

    @PostMapping("/payment/addPayment")
    public R addPayment(@RequestBody @Validated Payment paymentParam){
        return restTemplate.postForObject(URL + "/payment/addPayment", paymentParam, R.class);
    }

    @PostMapping("/payment/getPayment")
    public R getPaymentById(@Validated @RequestBody Payment paymentParam){
        return restTemplate.postForObject(URL + "/payment/getPayment", paymentParam, R.class);
    }


}