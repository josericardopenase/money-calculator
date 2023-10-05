package com.josericardopenase.core.infraestructure.ports;
import java.util.Date;
import java.util.List;
import java.util.Map;

public interface ExchangePort {
    double getExchangeRate(String fromCurrency, String toCurrency);
    double convertCurrency(String fromCurrency, String toCurrency, double amount);
    double[] getCurrencyPriceEvolution(String baseCurrency, String comparedCurrency,  Date startDate, Date endDate);
    Map<String, String> getSupportedCurrencies();
}
