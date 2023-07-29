package com.saji.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public
class Consumer {


    Logger log = Logger.getLogger(Consumer.class.getName());

    @KafkaListener(
            topics = "task",
            groupId = "myGroup")
    public void publishTask(String message) {
        log.info("MultipleTopicListener - " + message);
    }
}
