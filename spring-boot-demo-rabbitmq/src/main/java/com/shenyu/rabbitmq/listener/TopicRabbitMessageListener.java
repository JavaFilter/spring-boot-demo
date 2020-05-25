package com.shenyu.rabbitmq.listener;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.listener.api.ChannelAwareMessageListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName TopicRabbitMesageListener
 * @Author shenyu
 * @Date 2020/5/15
 * @Version 1.0.0
 */
@Component
public class TopicRabbitMessageListener implements ChannelAwareMessageListener {

    @Override
    public void onMessage(Message message, Channel channel) throws Exception {
        System.out.println("onMessage方法结束");
        channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
//        byte[] body = message.getBody();
//        System.out.println("监听到的消息,"+new String(body));
    }


}
