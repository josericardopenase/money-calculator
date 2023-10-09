package com.josericardopenase.core.application.usecases;
import com.josericardopenase.core.domain.entities.CurrencyConversion;
import com.josericardopenase.core.infraestructure.ports.ExchangePort;
import com.josericardopenase.core.infraestructure.repositories.CurrencyConversionRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CurrencyQuantityConverter {
    private final ExchangePort exchange;
    private final CurrencyConversionRepository repository;
    public CurrencyConversion convert(double quantity, String from, String to) {
        double resultQuantity = exchange.convertCurrency(from, to, quantity);
        CurrencyConversion conversion = new CurrencyConversion(1, quantity, resultQuantity, from, to);
        return repository.save(conversion);
    }
}