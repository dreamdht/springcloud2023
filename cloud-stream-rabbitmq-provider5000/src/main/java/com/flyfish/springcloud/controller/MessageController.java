package com.flyfish.springcloud.controller;

import com.flyfish.springcloud.service.MessageSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @autohr flyfish
 * @date: 2023/2/23 13:31
 * @description:
 */
@RestController
public class MessageController {
    @Resource
    private MessageSendService messageSendService;

    @RequestMapping("/sendMsg")
    public String sendMsg(){
        boolean result = messageSendService.send();
        if(result) return "OK";
        System.out.println("=============================="+result);
        return "Error";
    }
}
