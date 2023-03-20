package com.yan.publisher;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

@SpringBootApplication
public class JavaPublisherApplication {

    public static void main(String[] args) throws IOException, TimeoutException {

        RabbitTemplate rabbitTemplate = new RabbitTemplate();
        // 队列名称
        String queueName = "simple.queue";
        // 消息
        String message = "hello, spring amqp!";
        // 发送消息
        rabbitTemplate.convertAndSend(queueName, message);
        SpringApplication.run(JavaPublisherApplication.class, args);
    }

}
