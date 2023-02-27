package com.flyfish.springcloud.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @autohr flyfish
 * @date: 2023/2/23 13:28
 * @description:
 */
@EnableBinding(Source.class)
@Slf4j
public class MessageSendServiceImpl implements MessageSendService{
    @Autowired
    private Source source;

    @Override
    public boolean send() {
        String msg = UUID.randomUUID().toString();
        Message<String> outMsg = MessageBuilder.withPayload(msg).build();
        log.info("------->"+msg);
        return source.output().send(outMsg);
    }
}
