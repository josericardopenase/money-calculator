package com.josericardopenase.apis.rest.v1.currencyconversion;

import com.josericardopenase.core.application.usecases.ConvertCurrencyQuantityUseCase;
import com.josericardopenase.core.application.usecases.GetAllCurrencyConversionsUseCase;
import com.josericardopenase.core.application.usecases.GetCurrencyValueChartUseCase;
import com.josericardopenase.core.application.usecases.GetSupportedCurrenciesUseCase;
import com.josericardopenase.core.domain.entities.CurrencyConversion;
import com.josericardopenase.core.infraestructure.ports.ExchangePort;
import com.josericardopenase.core.infraestructure.repositories.CurrencyConversionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class CurrencyConversionService {

    private final ExchangePort exchange;
    private final CurrencyConversionRepository repository;

    @Autowired
    public CurrencyConversionService(ExchangePort exchangePort, CurrencyConversionRepository currencyConversionRepository) {
        this.exchange = exchangePort;
        this.repository = currencyConversionRepository;
    }

    public CurrencyConversion convertCurrency(String from, String to, double amount) {
        // Implement your currency conversion logic here
        // You can use exchange rates from a data source or API
        // Calculate the result amount and return it
        // Create a class CurrencyConversionResult to hold the result data
        var useCase = new ConvertCurrencyQuantityUseCase(this.exchange, this.repository);
        return useCase.execute(amount, from, to);
    }

    public List<CurrencyConversion> getAllCurrencyConversions() {
        // Implement your currency conversion logic here
        // You can use exchange rates from a data source or API
        // Calculate the result amount and return it
        // Create a class CurrencyConversionResult to hold the result data
        var useCase = new GetAllCurrencyConversionsUseCase(this.repository);
        return useCase.execute();
    }

    public double[] getCurrencyValueChart(String baseCurrency, String comparedCurrency, Date startDate, Date endDate)  {
        // Implement your currency conversion logic here
        // You can use exchange rates from a data source or API
        // Calculate the result amount and return it
        // Create a class CurrencyConversionResult to hold the result data
        var useCase = new GetCurrencyValueChartUseCase(this.exchange);
        return useCase.execute(baseCurrency, comparedCurrency, startDate, endDate);
    }

    public Map<String, String> getSupportedCurrencies(){
        var useCase = new GetSupportedCurrenciesUseCase(this.exchange);
        return useCase.execute();
    }

}