package com.hansonwang99.servicea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@RestController
public class ServiceAContorller {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/servicea")
    public String servicea() {
        try {
            Thread.sleep( 3000 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return restTemplate.getForObject("http://localhost:8882/serviceb", String.class);
    }
}
