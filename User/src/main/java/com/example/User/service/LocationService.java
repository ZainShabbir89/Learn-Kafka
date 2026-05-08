package com.example.User.service;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @KafkaListener(topics = "location",groupId = "user-group")
    public void updateLocation(String location){
        System.out.println(location);
    }
}
