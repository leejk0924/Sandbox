package com.jk.sandbox.valtest;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class AddUserRequest {

    @Email
    @NotEmpty(groups = {UserValidationGroup.class, AdminValidationGroup.class})
    private final String email;
    @NotBlank
    private final String pw;
    @Min(12)
    private final int age;
}
