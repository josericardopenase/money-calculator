package com.josericardopenase.core.domain.valueobjects;
import com.josericardopenase.core.domain.exceptions.DomainError;
import lombok.Getter;

@Getter
public class Id {
    private final int value;

    private Id(int value) {
        this.value = value;
    }

    public static void validate(int id) {
        if (id < 0) {
            throw new DomainError("Id cannot be less than 0");
        }
    }

    public static Id create(int id) {
        validate(id);
        return new Id(id);
    }

}