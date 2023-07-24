package com.saji.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public
class KListener {


    Logger log = Logger.getLogger(KListener.class.getName());

    @KafkaListener(
            topics = "reflectoring-2",
            groupId = "myGroup")
    public void commonListenerForMultipleTopics(String message) {
        log.info("MultipleTopicListener - " + message);
    }
}
