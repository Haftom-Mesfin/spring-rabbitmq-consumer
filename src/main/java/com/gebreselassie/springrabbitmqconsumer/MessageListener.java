package com.gebreselassie.springrabbitmqconsumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = MQConfig.QUEUE_NAME)
    public void listenet(CustomMessage customMessage){
        System.out.println(customMessage);
    }
}
