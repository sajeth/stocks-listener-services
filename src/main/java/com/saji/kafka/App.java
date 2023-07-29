package com.saji.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class App {
    //implements CommandLineRunner {

    //    @Autowired
//    Producer sender;
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
//    @Override
//    public void run(String... args) throws Exception {
//sender.sendMessage("test");
//
//    }

}
