package com.jk.sandbox.valtest;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PhoneController {
    @PostMapping("/phone")
    public ResponseEntity<String> temp(@RequestBody @Valid AddPhoneRequest addPhoneRequest) {
        return ResponseEntity.ok(addPhoneRequest.phone());
    }
}
