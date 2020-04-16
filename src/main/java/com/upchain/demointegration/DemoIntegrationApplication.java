package com.upchain.demointegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoIntegrationApplication {

    public static void main(String[] args) {
        System.out.println("Started.");

        SpringApplication.run(DemoIntegrationApplication.class, args);
    }

}
