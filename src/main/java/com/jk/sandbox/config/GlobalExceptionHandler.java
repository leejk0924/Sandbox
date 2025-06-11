package com.jk.sandbox.config;

import com.jk.sandbox.exception.UserNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler({UserNotFoundException.class, IllegalArgumentException.class})
    public ProblemDetail handleIllegalArg(UserNotFoundException ex, HttpServletRequest request) {
        ProblemDetail pd = ProblemDetail.forStatus(HttpStatus.NOT_FOUND);
        pd.setTitle("User Not Found");
        pd.setDetail(ex.getMessage());
        pd.setProperty("errorCode", "USER_NOT_FOUND");

        return pd;
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGeneral(Exception ex) {
        return ResponseEntity.status(500).body("Unexpected error: " + ex.getMessage());
    }
}
