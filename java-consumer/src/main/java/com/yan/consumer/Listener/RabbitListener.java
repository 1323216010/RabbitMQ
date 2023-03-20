package com.yan.consumer.Listener;

import org.springframework.stereotype.Component;

@Component
public class RabbitListener {

    @org.springframework.amqp.rabbit.annotation.RabbitListener(queues = "simple.queue")
    public void listenSimpleQueueMessage(String msg) throws InterruptedException {
        System.out.println("消费者接收到消息：【" + msg + "】");
    }
}