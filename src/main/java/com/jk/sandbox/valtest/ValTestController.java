package com.jk.sandbox.valtest;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ValTestController {
    private final UserService userService;
    @PostMapping("/user/add")
    public ResponseEntity<Void> addUser(@RequestBody @Valid AddUserRequest addUserRequest) {
        userService.addUser(addUserRequest);

        return ResponseEntity.noContent().build();
    }
}
