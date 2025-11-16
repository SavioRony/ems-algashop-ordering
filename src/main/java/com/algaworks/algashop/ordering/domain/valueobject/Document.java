package com.algaworks.algashop.ordering.domain.valueobject;

import java.util.Objects;

public record Document(String value) {

    public Document {
        Objects.requireNonNull(value, "document must not be null");

        if (value.isBlank()) {
            throw new IllegalArgumentException("document must not be blank");
        }
    }

    @Override
    public String toString() {
        return value;
    }
}
