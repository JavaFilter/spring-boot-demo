package com.shenyu.rabbitmq.config;

import com.shenyu.rabbitmq.listener.TopicRabbitMessageListener;
import org.springframework.amqp.core.AcknowledgeMode;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MessageListenerConfig
 * @Author shenyu
 * @Date 2020/5/15
 * @Version 1.0.0
 */
@Configuration
public class MessageListenerConfig {

    @Autowired
    private CachingConnectionFactory connectionFactory;
    @Autowired
    private TopicRabbitMessageListener topicRabbitMessageListener;

    /**
     * 监听
     * @return
     */
    private SimpleMessageListenerContainer simpleMessageListenerContainer(){
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer(connectionFactory);
        container.setConcurrentConsumers(1);
        container.setMaxConcurrentConsumers(1);
        //手动确认模式
        container.setAcknowledgeMode(AcknowledgeMode.AUTO);

        return container;
    }


    /**
     * 监听message队列
     * @return
     */
    private SimpleMessageListenerContainer topicListenerContainer(){
        SimpleMessageListenerContainer simpleMessageListenerContainer = this.simpleMessageListenerContainer();
        simpleMessageListenerContainer.setQueueNames("TestDirectQueue");
        simpleMessageListenerContainer.setMessageListener(topicRabbitMessageListener);
        return simpleMessageListenerContainer;
    }


}
