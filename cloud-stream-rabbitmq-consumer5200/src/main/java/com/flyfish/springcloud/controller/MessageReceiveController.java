package com.flyfish.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.RestController;

/**
 * @autohr flyfish
 * @date: 2023/2/23 15:48
 * @description:
 */
@RestController
@EnableBinding(Sink.class)
public class MessageReceiveController {
    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void getMsg(Message<String> message) {
        System.out.println("消费端口"+serverPort+"收到消息:"+message.getPayload());
    }
}