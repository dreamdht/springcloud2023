package com.flyfish.springcloud.service;

import com.flyfish.springcloud.pojo.Payment;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

/**
* @author 会飞的鱼
* @description 针对表【payment】的数据库操作Service
* @createDate 2023-02-08 20:21:44
*/
@Service
public interface PaymentService extends IService<Payment> {

}
