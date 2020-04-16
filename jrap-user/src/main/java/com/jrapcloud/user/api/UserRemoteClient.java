package com.jrapcloud.user.api;

import com.jrapcloud.user.config.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author IvanStephen
 * @project jrapcloud
 * @date 2020/4/17 7:18
 **/
@FeignClient(value = "eureka-client-core-service", configuration = FeignConfiguration.class)
public interface UserRemoteClient {
    @GetMapping("/getlog")
    String getTaskLog();
}
