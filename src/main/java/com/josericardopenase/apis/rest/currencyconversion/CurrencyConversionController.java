package com.josericardopenase.apis.rest.currencyconversion;

import com.josericardopenase.core.domain.entities.CurrencyConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/v1/currency_conversion")
public class CurrencyConversionController {
    @Autowired
    private CurrencyConversionService currencyConversionService;

    @GetMapping("/{from}/{to}/{amount}")
    public CurrencyConversion convertCurrency(
            @PathVariable String from,
            @PathVariable String to,
            @PathVariable double amount
    ) {
        return currencyConversionService.convertCurrency(from, to, amount);
    }

    @GetMapping("/history/")
    public List<CurrencyConversion> getAllCurrencyConversions() {
        return currencyConversionService.getAllCurrencyConversions();
    }

    @GetMapping("/currency_chart/{baseCurrency}/{comparedCurrency}")
    public double[] getCurrencyValueChart(
            @PathVariable String baseCurrency,
            @PathVariable String comparedCurrency
    ){
        Calendar calendar = Calendar.getInstance();
        Date currentDate = calendar.getTime();
        calendar.add(Calendar.MONTH, -6);
        Date sixMonthsAgoDate = calendar.getTime();
        return currencyConversionService.getCurrencyValueChart(baseCurrency, comparedCurrency, sixMonthsAgoDate, currentDate);
    }

    @GetMapping("/supported")
    public Map<String, String> getSupportedCurrencies(){
        return currencyConversionService.getSupportedCurrencies();
    }
}