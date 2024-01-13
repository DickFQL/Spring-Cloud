package com.fantasy.server_eureka01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerEureka01Application {

    public static void main(String[] args) {
        SpringApplication.run(ServerEureka01Application.class, args);
    }

}
