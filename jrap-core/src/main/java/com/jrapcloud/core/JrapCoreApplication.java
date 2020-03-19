package com.jrapcloud.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class JrapCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(JrapCoreApplication.class, args);
    }

}
