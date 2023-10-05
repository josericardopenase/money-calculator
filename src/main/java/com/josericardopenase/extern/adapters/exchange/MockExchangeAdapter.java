package com.josericardopenase.extern.adapters.exchange;

import com.josericardopenase.core.infraestructure.ports.ExchangePort;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MockExchangeAdapter implements ExchangePort {
    @Override
    public double getExchangeRate(String fromCurrency, String toCurrency) {
        return Math.random() * (2 - 0.5) + 0.5; // Random rate between 0.5 and 2
    }

    @Override
    public double convertCurrency(String fromCurrency, String toCurrency, double amount) {
        double exchangeRate = getExchangeRate(fromCurrency, toCurrency);
        return amount * exchangeRate;
    }

    @Override
    public double[] getCurrencyPriceEvolution(String baseCurrency, String comparedCurrency, Date startDate, Date endDate) {
        double[] priceEvolution = new double[0];
        Date currentDate = new Date(startDate.getTime());

        while (!currentDate.after(endDate)) {
            double randomPrice = Math.random() * (100 - 50) + 50; // Random price between 50 and 100
            double[] newArray = new double[priceEvolution.length + 1];
            System.arraycopy(priceEvolution, 0, newArray, 0, priceEvolution.length);
            newArray[priceEvolution.length] = randomPrice;
            priceEvolution = newArray;

            // Increment the date by one day for demonstration purposes
            currentDate.setTime(currentDate.getTime() + 24 * 60 * 60 * 1000);
        }

        return priceEvolution;
    }

    @Override
    public Map<String, String> getSupportedCurrencies() {
        Map<String, String> currencyMap = new HashMap<String, String>();

        // Add the currency data to the map
        currencyMap.put("AED", "United Arab Emirates Dirham");
        currencyMap.put("AFN", "Afghan Afghani");
        currencyMap.put("ALL", "Albanian Lek");
        // Add all the other currency data here...
        return currencyMap;
    }

}
