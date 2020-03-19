package com.jrapcloud.core.task.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author IvanStephen
 * @project jrapcloud
 * @date 2020/3/19 8:05
 **/
@Service
public class TaskService {
    @Async
    public void saveLog(){
        System.out.println(Thread.currentThread().getName());
    }
}
