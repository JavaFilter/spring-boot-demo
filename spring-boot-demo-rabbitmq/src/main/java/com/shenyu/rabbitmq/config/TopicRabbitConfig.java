package com.shenyu.rabbitmq.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName TopicRabbitConfig
 * @Author shenyu
 * @Date 2020/5/15
 * @Version 1.0.0
 */
@Configuration
public class TopicRabbitConfig {

/*    *//**
     *
     *//*
    public final static String topic = "topic";

    @Bean
    public Queue topicQueue() {
        return new Queue(TopicRabbitConfig.topic);
    }

    @Bean
    FanoutExchange exchange() {
        return new FanoutExchange("topicExchange");
    }


    //将firstQueue和topicExchange绑定,而且绑定的键值为topic.man
    //这样只要是消息携带的路由键是topic.man,才会分发到该队列
    @Bean
    Binding bindingExchangeMessage() {
        return BindingBuilder.bind(topicQueue()).to(exchange());
    }*/

//    //将secondQueue和topicExchange绑定,而且绑定的键值为用上通配路由键规则topic.#
//    // 这样只要是消息携带的路由键是以topic.开头,都会分发到该队列
//    @Bean
//    Binding bindingExchangeMessage2() {
//        return BindingBuilder.bind(secondQueue()).to(exchange()).with("topic.#");
//    }

}
