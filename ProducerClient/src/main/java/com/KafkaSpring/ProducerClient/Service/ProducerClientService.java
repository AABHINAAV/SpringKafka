package com.KafkaSpring.ProducerClient.Service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProducerClientService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void publishMessageInTopic(String message) {
        log.info(message);
        kafkaTemplate.send("temp-topic-1", message);

        /*
        one way is to create kafka template instance
        2nd way is to create instace of kafkaProducer class
        KafkaProducer producer = new KafkaProducer();
        producer.sendMessage("my-topic", "Hello from Kafka!");
         */
    }
}
