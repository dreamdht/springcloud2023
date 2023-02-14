package com.flyfish.springcloud.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.flyfish.springcloud.common.R;
import com.flyfish.springcloud.pojo.Payment;
import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @autohr flyfish
 * @date: 2023/2/14 20:22
 * @description:
 */

@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
@Service
public interface OrderService {

    @PostMapping("/payment/getPayment")
    R getPaymentById(@RequestBody @Validated Payment paymentParam);

    @GetMapping("/payment/getAll")
    List<Payment> getAllPayment();

    @GetMapping("/payment/outTime")
    String getTimeOutError();

    @GetMapping("/payment/server")
    String getServer();
}
