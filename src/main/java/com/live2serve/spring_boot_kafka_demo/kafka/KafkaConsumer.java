package com.live2serve.spring_boot_kafka_demo.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private final static Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);

    @KafkaListener(topics = "Topic002", groupId = "testGroup")
    public void consume(String message){
        LOGGER.info(String.format("Message received -> %s", message));
    }
}
