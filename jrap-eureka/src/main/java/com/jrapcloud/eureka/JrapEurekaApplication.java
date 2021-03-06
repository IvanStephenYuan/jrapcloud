package com.jrapcloud.eureka;

//import com.jrapcloud.common.base.StartCommand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class JrapEurekaApplication {
    public static void main(String[] args) {
        //使用自动接口
        //new StartCommand(args);
        SpringApplication.run(JrapEurekaApplication.class, args);
    }
}
