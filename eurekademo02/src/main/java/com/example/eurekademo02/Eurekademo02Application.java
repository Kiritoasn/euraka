package com.example.eurekademo02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eurekademo02Application {
//你2好
    public static void main(String[] args) {
        SpringApplication.run(Eurekademo02Application.class, args);
    }

}
