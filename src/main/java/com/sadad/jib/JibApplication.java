package com.sadad.jib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableFeignClients
public class JibApplication {
    private static final Logger log = LoggerFactory.getLogger(JibApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(JibApplication.class, args);
    }
}
