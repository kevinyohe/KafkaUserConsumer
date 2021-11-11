package com.example.userconsumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class UserConsumer {

    @KafkaListener(topics = {"user-topic"})
    public void consumerUserData(int age){
        System.out.println("age = " + age);

    }
}
