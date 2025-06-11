package com.jk.sandbox.valtest;

import jakarta.validation.ConstraintValidatorContext;

import java.lang.annotation.Annotation;


public interface ConstraintValidator <A extends Annotation, T> {
    default void initialize(A constraintAnnotation) {

    }

    boolean isValid(T value, ConstraintValidatorContext context);
}
