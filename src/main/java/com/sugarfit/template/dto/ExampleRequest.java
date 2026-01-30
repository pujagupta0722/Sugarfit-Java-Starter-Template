package com.sugarfit.template.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ExampleRequest {

    @NotBlank
    private String userId;

    @NotNull
    private Integer value;

    public String getUserId() {
        return userId;
    }

    public Integer getValue() {
        return value;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}