package com.saji.kafka.controller;

import com.saji.kafka.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KController {

    @Autowired
    Producer sender;


    // Implementing a GET method
    @PostMapping("/kafka/publish")
    public HttpStatus publishMessage(
            @RequestParam("message") String message) {
        try {
            sender.sendMessage(message);
        } catch (Exception e) {
            e.printStackTrace();
            return HttpStatus.EXPECTATION_FAILED;
        }
        return HttpStatus.ACCEPTED;
    }

}
