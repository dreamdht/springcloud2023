package com.flyfish.springcloud.service.impl;

import com.flyfish.springcloud.service.InfoService;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @autohr flyfish
 * @date: 2023/2/23 21:52
 * @description:
 */
@Service
public class InfoServiceImpl implements InfoService {
    @Override
    public String sendMsg() {
        return "消费者端发送了一条消息"+(UUID.randomUUID().toString());
    }
}
