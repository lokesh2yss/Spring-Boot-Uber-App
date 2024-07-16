package com.codingshuttle.project.uber.uberApp.advices;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
public class ApiResponse<T> {
    @JsonFormat(pattern = "hh:mm:ss dd-MM-yyyy")
    private LocalDateTime timeStamp;
    private ApiError error;
    private T data;

    public ApiResponse() {
        this.timeStamp = LocalDateTime.now();
    }
    public ApiResponse(T data) {
        this();
        this.data = data;
    }
    public ApiResponse(ApiError error) {
        this();
        this.error = error;
    }
}
