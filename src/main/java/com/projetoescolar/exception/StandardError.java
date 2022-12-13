package com.projetoescolar.exception;

import lombok.AllArgsConstructor;


import java.time.LocalDateTime;
@AllArgsConstructor
public class StandardError {
    private LocalDateTime timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;
}
