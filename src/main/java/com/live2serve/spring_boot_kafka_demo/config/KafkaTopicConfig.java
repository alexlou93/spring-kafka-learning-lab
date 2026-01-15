package com.live2serve.spring_boot_kafka_demo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic test01Topic(){
        return TopicBuilder.name("Topic002")
                .build();
    }

    @Bean
    public NewTopic test02Topic(){
        return TopicBuilder.name("JsonTopic")
                .build();
    }
}
