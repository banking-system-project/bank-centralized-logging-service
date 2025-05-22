package com.bank.notification.kafka;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class BranchNotifiactionConsumer {


    private static final Logger log = LoggerFactory.getLogger(BranchNotifiactionConsumer.class);

    @KafkaListener(
            topics = "${spring.kafka.topic.name}",
            groupId = "${spring.kafka.consumer.group-id}"
    )
    public void consumeBranchNotification(String message) {
        log.info("Event received with message: {}", message);
    }
}
