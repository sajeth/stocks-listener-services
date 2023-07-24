package com.saji.kafka.controller;

import com.saji.kafka.service.KListener;
import com.saji.kafka.service.KSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KController {

    @Autowired
    KSender sender;


    // Implementing a GET method
    @GetMapping("/publish/{message}")
    public String publish_message(
            @PathVariable("message") String message) {
        sender.sendMessage(message);
        return "Message Published on Kafka !";
    }

}
