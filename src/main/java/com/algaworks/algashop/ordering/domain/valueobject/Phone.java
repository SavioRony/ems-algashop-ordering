package com.algaworks.algashop.ordering.domain.valueobject;

import java.util.Objects;

public record Phone(String value) {

    public Phone {
        Objects.requireNonNull(value, "phone must not be null");

        if (value.isBlank()) {
            throw new IllegalArgumentException("phone must not be blank");
        }
    }

    @Override
    public String toString() {
        return value;
    }
}
