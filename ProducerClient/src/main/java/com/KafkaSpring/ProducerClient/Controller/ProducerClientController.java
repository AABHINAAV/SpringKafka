package com.KafkaSpring.ProducerClient.Controller;

import com.KafkaSpring.ProducerClient.Service.ProducerClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producer")
@Slf4j
public class ProducerClientController {

    @Autowired
    private ProducerClientService producerClientService;

    @PostMapping("/sendMessage")
    @ResponseStatus(HttpStatus.CREATED)
    public void sendMessageToTopic(@RequestBody String message) {
        this.producerClientService.publishMessageInTopic(message);
    }
}
