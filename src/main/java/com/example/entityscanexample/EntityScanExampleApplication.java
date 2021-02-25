package com.example.entityscanexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.${test}")
public class EntityScanExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(EntityScanExampleApplication.class, args);
    }
}
