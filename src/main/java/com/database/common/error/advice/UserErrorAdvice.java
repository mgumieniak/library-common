package com.database.common.error.advice;

import com.database.common.error.Error;
import com.database.common.error.exception.WebServerException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class UserErrorAdvice {

    @ExceptionHandler({WebServerException.class})
    public ResponseEntity<Error> handleWebServerException(WebServerException ex) {
        return error(ex);
    }

    private ResponseEntity<Error> error(WebServerException ex) {
        Error error = Error.createError(ex.getCode(), ex.getMessage(), ex.getCause());
        return ResponseEntity
                .status(ex.getCode())
                .body(error);
    }
}
