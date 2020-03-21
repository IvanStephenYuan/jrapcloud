package com.jrapcloud.core.task.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

/**
 * @author IvanStephen
 * @project jrapcloud
 * @date 2020/3/19 8:05
 **/
@Service
public class TaskService {
    @Async("taskExecutor")
    public Future<String> saveLog(){
        String threadName = Thread.currentThread().getName();
        System.out.println("Service:" + threadName);
        return new AsyncResult<>(threadName);
    }
}
