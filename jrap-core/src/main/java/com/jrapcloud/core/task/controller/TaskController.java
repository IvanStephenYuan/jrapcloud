package com.jrapcloud.core.task.controller;

import com.jrapcloud.core.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author IvanStephen
 * @project jrapcloud
 * @date 2020/3/19 8:08
 **/
@RestController
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/getlog")
    public void getTaskLog(){
        taskService.saveLog();
    }
}
