package com.zhaoqin.shopcommon.mq.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName TopicReceiver2
 * @Author zhaoqin
 * @Date 2020/3/8
 */
@Component
@RabbitListener(queues = "q_topic_messages")
public class TopicReceiver2 {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver2  : " + hello);
    }

}
