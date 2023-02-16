package com.flyfish.springcloud.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @autohr flyfish
 * @date: 2023/2/15 19:45
 * @description:
 */
@Service
public class PaymentService {

    public String paymentOk(Integer id){
        return "线程池: "+Thread.currentThread().getName()+"  paymentOk";
    }

    public String paymentTimeout(Integer id){
        Integer sleepTime = 2000;
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池: "+Thread.currentThread().getName()+"  paymentTimeout,耗时"+sleepTime;
    }
}
