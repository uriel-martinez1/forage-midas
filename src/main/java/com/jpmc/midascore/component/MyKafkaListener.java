package com.jpmc.midascore.component;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MyKafkaListener {

    @KafkaListener(topics = "alaska")
    public void listen(String message){
        System.out.println("Message" + message);
    }
}
