package com.example.springbootassessment.exception;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ErrorInfo {

    private String errorMessage;
    private Integer errorCode;
    private LocalDateTime errorTime;
}
