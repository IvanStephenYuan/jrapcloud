package com.jrapcloud.eureka;

import com.jrapcloud.common.base.StartCommand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class JrapEurekaApplication {
    public static void main(String[] args) {
        //使用自动接口
        //new StartCommand(args);
        SpringApplication.run(JrapEurekaApplication.class, args);
    }
}
