package com.fantasy.server_user01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fantasy.server_user01.mapper")
public class ServerUser01Application {

    public static void main(String[] args) {
        SpringApplication.run(ServerUser01Application.class, args);
    }

}
