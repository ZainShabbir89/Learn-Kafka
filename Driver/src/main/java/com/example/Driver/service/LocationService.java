package com.example.Driver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    public Boolean updateLocation(String location){
        kafkaTemplate.send("location",location);
        return true;
    }
}
