package com.KafkaSpring.ProducerClient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
@Slf4j
public class ProducerClientApplication implements CommandLineRunner {

    @Autowired
    private Environment environment;

    public static void main(String[] args) {
        SpringApplication.run(ProducerClientApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info(environment.getProperty("spring.application.name") + " running at " + environment.getProperty("server.port"));
    }
}
