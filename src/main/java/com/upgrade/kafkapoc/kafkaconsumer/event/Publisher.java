package com.upgrade.kafkapoc.kafkaconsumer.event;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value="kafka-producer-enabled", havingValue = "true")
public class Publisher {

    private final KafkaTemplate<String, String> template;

    @Value(value = "${message.topic.name}")
    private String topicName;

    public Publisher(KafkaTemplate<String, String> template) {
        this.template = template;
    }

    @Scheduled(initialDelay = 100, fixedDelay = 7000)
    public void send() {
        String message = "test message";

        template.send(topicName, message);
    }
}