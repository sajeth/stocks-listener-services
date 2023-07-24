package com.saji.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public
class KSender {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;
    Logger log = Logger.getLogger(KSender.class.getName());


    public void sendMessage(String message) {
        log.info(message);
        kafkaTemplate.send("reflectoring-2", message);
    }

}
