package com.algaworks.algashop.ordering.domain.valueobject;

import com.algaworks.algashop.ordering.domain.validator.FieldValidations;

import java.util.Objects;

import static com.algaworks.algashop.ordering.domain.exception.ErrorMessages.VALIDATION_ERROR_EMAIL_IS_INVALID;

public record Email(String value) {

    public Email {
        Objects.requireNonNull(value, "email must not be null");
        FieldValidations.requiresValidEmail(value, VALIDATION_ERROR_EMAIL_IS_INVALID);
    }

    @Override
    public String toString() {
        return value;
    }
}
