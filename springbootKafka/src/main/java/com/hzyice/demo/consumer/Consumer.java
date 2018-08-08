package com.hzyice.demo.consumer;


//@Component
//public class Consumer {
//
//
//    // 不能使用这种方式接收消息。
////    @KafkaListener(topics = {"test"})
////    public void receive(Message message) {
////        System.out.println("KafkaListener 消费了:" + message);
////    }
//
//
//
//    @KafkaListener(topics = {"test"})
//    public void listen(ConsumerRecord<?, ?> record){
//        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
//
//        if (kafkaMessage.isPresent()) {
//            System.out.println("消息体消息= "+record);
//            System.out.println("data= " + record.value());
//        }
//
//    }
//
//
//}
