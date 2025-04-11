package org.example.userprofilems.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.example.userprofilems.exception.user.DuplicateUserException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.Instant;

@RestControllerAdvice
public class GlobalExceptionHandler {
    //create a method to receive the exception and display user-friendly message
    //data integrating violation exception when two users are trying to create the same time
    @ExceptionHandler(DuplicateUserException.class)
    public ResponseEntity<ApiError> handleDuplicateUserException(DuplicateUserException e, HttpServletRequest request){
        ApiError apiError = new ApiError(
                e.getMessage(),
                request.getRequestURI(),
                HttpStatus.BAD_REQUEST.value(),
                Instant.now()
        );
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(apiError);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<ApiError> handleDataIntegrityViolationException(DataIntegrityViolationException e, HttpServletRequest request){
        ApiError apiError = new ApiError(
                e.getMessage(),
                request.getRequestURI(),
                HttpStatus.BAD_REQUEST.value(),
                Instant.now()
        );
        return ResponseEntity.status(HttpStatus.CONFLICT).body(apiError);
    }
}
