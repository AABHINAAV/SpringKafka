package com.KafkaSpring.ConsumerClient.Config;

import com.KafkaSpring.ConsumerClient.Util.AppConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
@Slf4j
public class KafkaConsumerConfig {
    @KafkaListener(topics = AppConstants.TOPIC_NAME , groupId = AppConstants.GROUP_ID)
    public void readMessages(String message) {
        log.info(message);
        System.out.println(message);
    }
}
