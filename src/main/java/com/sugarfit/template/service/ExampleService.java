package com.sugarfit.template.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    public String process(String userId, Integer value) {
        return UUID.randomUUID().toString();
    }
}
