package com.josericardopenase.core.domain.exceptions;

public class DomainError extends RuntimeException {
    public DomainError(String message) {
        super("Domain error: " + message);
    }
}