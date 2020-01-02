package com.upgrade.kafkapoc.kafkaconsumer.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Subscriber {

    @KafkaListener(topics = "${message.topic.name}", id="spectrum-consumer")
    public void eventHandler(@Payload String message, @Headers MessageHeaders headers) {
        log.info("Message received: {}", message);
    }
}