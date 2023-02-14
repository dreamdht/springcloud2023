package com.flyfish.springcloud.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.flyfish.springcloud.common.R;
import com.flyfish.springcloud.pojo.Payment;
import com.flyfish.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @autohr flyfish
 * @date: 2023/2/8 20:23
 * @description:
 */

@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/addPayment")
    public R addPayment(@RequestBody @Validated Payment paymentParam){
        if(paymentParam==null){
            return R.error("传入参数为null");
        }

        boolean result = paymentService.save(paymentParam);

        if(result) return R.success(paymentParam);

        else return R.error("添加失败！");
    }

    @PostMapping ("/getPayment")
    public R getPaymentById(@RequestBody @Validated Payment paymentParam){
        if(StringUtils.isEmpty(String.valueOf(paymentParam.getNum()))){
            return R.error("请填写完整单号");
        }

        LambdaQueryWrapper<Payment> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Payment::getId,paymentParam.getId());
        Payment payment = paymentService.getOne(queryWrapper);

        if(payment==null) return R.error("没有查到该账单");

        return R.success(payment);
    }

    @GetMapping("/getAll")
    public List<Payment> getAllPayment(){
        return paymentService.list();
    }


    @GetMapping("/server")
    public Object getServer(){
        List<String> services = discoveryClient.getServices();

        for (String service : services) {
            log.info("---->",service);
        }

        log.info("***************************************");

        List<ServiceInstance> instances = discoveryClient.getInstances("cloud-payment-server");

        for (ServiceInstance instance : instances) {
            log.info(instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getServiceId());
        }
        
        return 8003;
    }

}
