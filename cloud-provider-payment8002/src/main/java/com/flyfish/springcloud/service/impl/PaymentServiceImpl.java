package com.flyfish.springcloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.flyfish.springcloud.pojo.Payment;
import com.flyfish.springcloud.service.PaymentService;
import com.flyfish.springcloud.mapper.PaymentMapper;
import org.springframework.stereotype.Service;

/**
* @author 会飞的鱼
* @description 针对表【payment】的数据库操作Service实现
* @createDate 2023-02-08 20:21:44
*/
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment>
    implements PaymentService{

}




