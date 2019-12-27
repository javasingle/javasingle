package com.single.singletest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SingleTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SingleTestApplication.class, args);
    }

}
