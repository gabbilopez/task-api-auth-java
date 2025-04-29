package com.gabbi.taskapi.service;

import org.springframework.stereotype.Service;

@Service
public class TaskApiService {

    public String helloWorld(String name) {
        return "Hello Video!"+ name;
    }
}
