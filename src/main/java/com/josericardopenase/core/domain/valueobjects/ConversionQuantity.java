package com.josericardopenase.core.domain.valueobjects;
import com.josericardopenase.core.domain.exceptions.ValidationError;
import lombok.Getter;

@Getter
public class ConversionQuantity {
    private final double value;

    private ConversionQuantity(double value) {
        this.value = value;
    }

    public static void validate(double quantity) {
        if (quantity < 0) {
            throw new ValidationError("Conversion quantity must be a numeric value greater than 0");
        }
    }

    public static ConversionQuantity create(double quantity) {
        validate(quantity);
        return new ConversionQuantity(quantity);
    }

}