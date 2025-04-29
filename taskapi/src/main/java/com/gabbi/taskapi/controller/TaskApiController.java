package com.gabbi.taskapi.controller;


import com.gabbi.taskapi.service.TaskApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class TaskApiController {

    private TaskApiService taskApiService;


    public TaskApiController(TaskApiService taskApiService) {
        this.taskApiService = taskApiService;
    }

    @GetMapping
    public String helloWorld() {
        return "Hello World!";
    }

}
