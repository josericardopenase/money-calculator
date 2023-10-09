package com.josericardopenase.core.infraestructure.services;
import java.util.Date;
import java.util.Map;

public interface ExchangeService {
    double getExchangeRate(String fromCurrency, String toCurrency);
    double convertCurrency(String fromCurrency, String toCurrency, double amount);
    double[] getCurrencyPriceEvolution(String baseCurrency, String comparedCurrency,  Date startDate, Date endDate);
    Map<String, String> getSupportedCurrencies();
}