package com.jrapcloud.core.task.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author IvanStephen
 * @project jrapcloud
 * @date 2020/3/19 7:27
 **/
@Data
@Component
@ConfigurationProperties(prefix = "spring.task.pool")
public class TaskThreadPoolConfig {
    //核心线程数
    private int corePoolSize = 5;

    //最大线程数
    private int maxPoolSize = 50;

    //线程池维护线程所允许空闲时间
    private int keepAliveSeconds = 60;

    //队列长度
    private int queueCapacity = 1000;

    //线程名前缀
    private String threadNamePrefix = "CORE-AsysnTask-";
}
