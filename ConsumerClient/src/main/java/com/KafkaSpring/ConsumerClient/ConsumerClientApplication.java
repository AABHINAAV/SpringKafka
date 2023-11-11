package com.KafkaSpring.ConsumerClient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
@Slf4j
public class ConsumerClientApplication implements CommandLineRunner {

    @Autowired
    private Environment environment;

    public static void main(String[] args) {
        SpringApplication.run(ConsumerClientApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info(environment.getProperty("spring.application.name") + " running at " + environment.getProperty("server.port"));
    }
}
