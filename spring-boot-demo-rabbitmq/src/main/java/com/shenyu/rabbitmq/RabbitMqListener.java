package com.shenyu.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @ClassName RabbitMqListener
 * @Author shenyu
 * @Date 2020/5/14
 * @Version 1.0.0
 */
@Component
//@RabbitListener(queues = "TestDirectQueue")
public class RabbitMqListener {

    @RabbitHandler
    public void process(Map testMessage) {
        System.out.println("DirectReceiver消费者收到消息  : " + testMessage.toString());
    }

}
