package com.ykp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ykp")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
