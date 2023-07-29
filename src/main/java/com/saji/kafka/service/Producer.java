package com.saji.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public
class Producer {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;
    Logger log = Logger.getLogger(Producer.class.getName());


    public void sendMessage(String message) {
        log.info(message);
        kafkaTemplate.send("task", message);
    }

}
