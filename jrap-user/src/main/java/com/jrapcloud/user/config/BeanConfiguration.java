package com.jrapcloud.user.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author IvanStephen
 * @project jrapcloud
 * @date 2020/3/20 20:49
 **/
@Configuration
public class BeanConfiguration {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
