package com.flyfish.springcloud.mapper;

import com.flyfish.springcloud.pojo.Payment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 会飞的鱼
* @description 针对表【payment】的数据库操作Mapper
* @createDate 2023-02-08 20:21:44
* @Entity com.flyfish.springcloud.pojo.Payment
*/
@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {

}




