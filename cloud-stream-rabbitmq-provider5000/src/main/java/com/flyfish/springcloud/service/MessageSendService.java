package com.flyfish.springcloud.service;

import org.springframework.stereotype.Service;

/**
 * @autohr flyfish
 * @date: 2023/2/23 13:27
 * @description:
 */
@Service
public interface MessageSendService {
    boolean send();
}
