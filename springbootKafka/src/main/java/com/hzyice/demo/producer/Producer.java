package com.hzyice.demo.producer;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;



/*
消息生产者
 */

@Component
public class Producer {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    private static Gson gson = new GsonBuilder().create();

    // 发送消息
    public void send() {
        Message message = new Message("abc", "hello", new Date());
        kafkaTemplate.send("test", gson.toJson(message));
    }

    public static void main(String[] args) {
        Producer producer = new Producer();
        producer.send();
    }




}
