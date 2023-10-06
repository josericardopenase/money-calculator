package com.josericardopenase.apis.rest.v1.currencyconversion;

import com.josericardopenase.core.domain.entities.CurrencyConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/v1/currencies/")
public class CurrencyConversionController {
    @Autowired
    private CurrencyConversionService currencyConversionService;

    @GetMapping("/{from}/convert/{to}/amount/{amount}/")
    public CurrencyConversion convertCurrency(
            @PathVariable String from,
            @PathVariable String to,
            @PathVariable double amount
    ) {
        return currencyConversionService.convertCurrency(from, to, amount);
    }

    @GetMapping("/conversions/")
    public List<CurrencyConversion> getAllCurrencyConversions() {
        return currencyConversionService.getAllCurrencyConversions();
    }

    @GetMapping("/{baseCurrency}/chart/{comparedCurrency}/")
    public double[] getCurrencyValueChart(
            @PathVariable String baseCurrency,
            @PathVariable String comparedCurrency
    ){
        Calendar calendar = Calendar.getInstance();
        Date currentDate = calendar.getTime();
        calendar.add(Calendar.MONTH, -12);
        Date yearAgo = calendar.getTime();
        return currencyConversionService.getCurrencyValueChart(baseCurrency, comparedCurrency, yearAgo, currentDate);
    }

    @GetMapping("/")
    public Map<String, String> getSupportedCurrencies(){
        return currencyConversionService.getSupportedCurrencies();
    }

    @GetMapping("/{id}/")
    public Map<String, String> getDetailedCurrency(
            @PathVariable String id
    )
    {
        return currencyConversionService.getSupportedCurrencies();
    }
}