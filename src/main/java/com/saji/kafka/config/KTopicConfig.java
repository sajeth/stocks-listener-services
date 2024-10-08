package com.saji.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KTopicConfig {
    @Bean
    public NewTopic topic1() {
        return TopicBuilder.name("task").build();
    }

    @Bean
    public NewTopic topic2() {
        return TopicBuilder.name("response").build();
    }

}
