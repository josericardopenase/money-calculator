package com.josericardopenase.core.domain.entities;
import com.josericardopenase.core.domain.valueobjects.ConversionQuantity;
import com.josericardopenase.core.domain.valueobjects.Currency;
import com.josericardopenase.core.domain.valueobjects.Id;

public class CurrencyConversion {
    private Id id;
    private final ConversionQuantity quantity;
    private final ConversionQuantity result;
    private final Currency from;
    private final Currency to;

    public CurrencyConversion(int id, double quantity, double result, String from, String to) {
        this.id = Id.create(id);
        this.quantity = ConversionQuantity.create(quantity);
        this.result = ConversionQuantity.create(result);
        this.from = Currency.create(from);
        this.to = Currency.create(to);
    }

    public double getId() {
        return id.getValue();
    }

    public void setId(int id) {
        this.id = Id.create(id);
    }

    public double getQuantity() {
        return quantity.getValue();
    }

    public double getResult() {
        return result.getValue();
    }

    public String getFrom() {
        return from.getValue();
    }

    public String getTo() {
        return to.getValue();
    }
}