package com.jk.sandbox.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.ErrorResponseException;

public class UserNotFoundException extends ErrorResponseException {
    public UserNotFoundException(Long userId) {
        super(HttpStatus.NOT_FOUND, createProblemDetail(userId), null);
    }

    private static ProblemDetail createProblemDetail(Long userId) {
        ProblemDetail pd = ProblemDetail.forStatus(HttpStatus.NOT_FOUND);
        pd.setTitle("User Not Found");
        pd.setDetail("User with ID " + userId + " not found");
        pd.setProperty("errorCode", "USER_NOT_FOUND"); // 커스텀 에러 코드
        return pd;
    }
}
