package com.jrapcloud.user.login.controller;

import com.jrapcloud.user.api.UserRemoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author IvanStephen
 * @project jrapcloud
 * @date 2020/3/20 20:50
 **/
@RestController
public class LogTestController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserRemoteClient userRemoteClient;

    @GetMapping("/callLog")
    public String callTestLog(){
        //System.out.println("use=>eureka-client-core-service:getlog");
        //return restTemplate.getForObject("http://eureka-client-core-service/getlog", String.class);
        String result = userRemoteClient.getTaskLog();
        System.out.println("调用结果：" + result);
        return result;
    }
}
