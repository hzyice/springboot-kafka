package com.hzyice.kafkacustomer;


import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Constomer {


    // 不能使用这种方式接收消息。
//    @KafkaListener(topics = {"test"})
//    public void receive(Message message) {
//        System.out.println("KafkaListener 消费了:" + message);
//    }



    @KafkaListener(topics = {"test"})
    public void listen(ConsumerRecord<?, ?> record){
        Optional<?> kafkaMessage = Optional.ofNullable(record.value());

        if (kafkaMessage.isPresent()) {
            System.out.println("1 消息体消息= "+record);
            System.out.println("1 data= " + record.value());
        }

    }


}