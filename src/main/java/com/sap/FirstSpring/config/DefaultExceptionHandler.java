package com.sap.FirstSpring.config;

import com.sap.FirstSpring.exceptions.CustomNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class DefaultExceptionHandler {

    @ExceptionHandler(CustomNotFoundException.class)
    public ResponseEntity<String> notFoundException(CustomNotFoundException ex) {
        return new ResponseEntity<>("Something was not found", HttpStatus.NOT_FOUND);
    }

}
