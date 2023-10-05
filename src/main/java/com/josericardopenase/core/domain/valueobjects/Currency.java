package  com.josericardopenase.core.domain.valueobjects;

import com.josericardopenase.core.domain.exceptions.ValidationError;
import lombok.Getter;

@Getter
public class Currency {
    private final String value;

    private Currency(String value) {
        this.value = value;
    }

    public static void validate(String currency) {
        if (!currency.matches("^[A-Z]{3}$")) {
            throw new ValidationError("Currency must be a string of 3 uppercase letters");
        }
    }

    public static Currency create(String currency) {
        validate(currency);
        return new Currency(currency);
    }

}