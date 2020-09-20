package com.atguigu.stringcloud.controller;

import com.atguigu.stringcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author QY
 * @version 1.0
 * @date 2020/9/20 14:39
 */
@RestController
public class SendMessageController {

    @Resource
    private IMessageProvider messageProvider;

    @GetMapping(value = "/sendMessage")
    private String sendMessage(){
        return messageProvider.send();
    }
}
