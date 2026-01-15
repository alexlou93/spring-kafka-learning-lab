package com.live2serve.spring_boot_kafka_demo.kafka;

import com.live2serve.spring_boot_kafka_demo.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private final static Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "JsonTopic", groupId = "testGroup")
    public void consume(User user){
        LOGGER.info(String.format("Json message received -> %s", user.toString()));
    }
}
