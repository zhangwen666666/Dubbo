package com.zw;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class LinkProvider2Application {
    public static void main(String[] args) {
        SpringApplication.run(LinkProvider2Application.class, args);
    }
}
