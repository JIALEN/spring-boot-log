package com.alen.log;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.alen.log.*")
public class SpringBootLogApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringBootLogApplication.class, args);
    }

}
