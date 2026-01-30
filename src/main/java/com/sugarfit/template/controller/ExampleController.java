package com.sugarfit.template.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sugarfit.template.dto.ExampleRequest;
import com.sugarfit.template.dto.ExampleResponse;
import com.sugarfit.template.service.ExampleService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/example")
public class ExampleController {

    private final ExampleService exampleService;

    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @PostMapping
    public ExampleResponse process(@Valid @RequestBody ExampleRequest request) {
        String requestId = exampleService.process(
                request.getUserId(),
                request.getValue()
        );

        return new ExampleResponse("SUCCESS", requestId);
    }
}