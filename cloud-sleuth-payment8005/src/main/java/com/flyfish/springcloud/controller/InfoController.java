package com.flyfish.springcloud.controller;

import com.flyfish.springcloud.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @autohr flyfish
 * @date: 2023/2/23 21:52
 * @description:
 */
@RestController
@RequestMapping("/payment")
public class InfoController {
    @Autowired
    private InfoService infoService;

    @RequestMapping("/send")
    public String sendMsg(){
        return infoService.sendMsg();
    }
}
