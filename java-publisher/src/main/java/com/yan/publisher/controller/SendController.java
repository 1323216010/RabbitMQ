package com.yan.publisher.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yan
 **/
@RestController
public class SendController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping("/send")
    public void send() {
        String queue = "simple.queue";
        // 消息
        String msg = "hello, spring amqp!";
        // 发送消息
        rabbitTemplate.convertAndSend(queue, msg);
    }

}
