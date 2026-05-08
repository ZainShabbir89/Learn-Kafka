package com.example.Driver.controller;

import com.example.Driver.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @PutMapping
    public ResponseEntity<?> updateLocation() throws InterruptedException {
        int range=100;
        while(range>0){
            locationService.updateLocation(Math.random()+" , "+Math.random());
            Thread.sleep(1000);
            range--;
        }
        return new ResponseEntity<>(Map.of("message","updated Location"), HttpStatus.OK);
    }

    // this is the testing for git commit

}
