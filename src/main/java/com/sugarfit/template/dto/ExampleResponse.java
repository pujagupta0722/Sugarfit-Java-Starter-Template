package com.sugarfit.template.dto;

public class ExampleResponse {

    private final String status;
    private final String requestId;

    public ExampleResponse(String status, String requestId) {
        this.status = status;
        this.requestId = requestId;
    }

    public String getStatus() {
        return status;
    }

    public String getRequestId() {
        return requestId;
    }
}