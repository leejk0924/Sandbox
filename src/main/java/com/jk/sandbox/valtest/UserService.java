package com.jk.sandbox.valtest;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Validated
@Service
public class UserService {
    public void addUser(@Valid AddUserRequest addUserRequest) {

    }
}
