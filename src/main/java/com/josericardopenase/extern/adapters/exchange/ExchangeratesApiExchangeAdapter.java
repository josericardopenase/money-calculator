package com.josericardopenase.extern.adapters.exchange;

import com.josericardopenase.core.infraestructure.ports.ExchangePort;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ExchangeratesApiExchangeAdapter implements ExchangePort {
    @Override
    public double getExchangeRate(String fromCurrency, String toCurrency) {
        return 0;
    }

    @Override
    public double convertCurrency(String fromCurrency, String toCurrency, double amount) {
        return 0;
    }

    @Override
    public double[] getCurrencyPriceEvolution(String baseCurrency, String comparedCurrency, Date startDate, Date endDate) {
        return new double[]{};
    }

    @Override
    public Map<String, String> getSupportedCurrencies() {
        return null;
    }

}
