package com.josericardopenase.core.domain.valueobjects;
import com.josericardopenase.core.domain.exceptions.ValidationError;
import lombok.Getter;

@Getter
public class Id {
    private final int value;

    private Id(int value) {
        this.value = value;
    }

    public static void validate(int id) {
        if (id < 0) {
            throw new ValidationError("Id cannot be less than 0");
        }
    }

    public static Id create(int id) {
        validate(id);
        return new Id(id);
    }

}