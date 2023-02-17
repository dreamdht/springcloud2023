package com.flyfish.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
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

    @HystrixCommand(fallbackMethod = "paymentTimeoutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "2000")
    })
    public String paymentTimeout(Integer id){
        Integer sleepTime = 5000;
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池: "+Thread.currentThread().getName()+"  paymentTimeout,耗时"+sleepTime;
    }

    public String paymentTimeoutHandler(Integer id){
        return "访问量太大啦！QAQ";
    }
}
