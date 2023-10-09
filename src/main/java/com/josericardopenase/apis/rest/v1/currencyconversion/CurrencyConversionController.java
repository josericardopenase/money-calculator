package com.josericardopenase.apis.rest.v1.currencyconversion;

import com.josericardopenase.apis.rest.shared.responses.ApiPaginatedResponseWrapper;
import com.josericardopenase.apis.rest.shared.responses.ApiResponseWrapper;
import com.josericardopenase.core.domain.entities.CurrencyConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin(origins = "http://localhost:5173/", maxAge = 3600)
@RequestMapping("/v1/currencies/")
public class CurrencyConversionController {
    @Autowired
    private CurrencyConversionService currencyConversionService;

    @GetMapping("/{from}/convert/{to}/amount/{amount}/")
    public ApiResponseWrapper<CurrencyConversion> convertCurrency(
            @PathVariable String from,
            @PathVariable String to,
            @PathVariable double amount
    ) {
        return new ApiResponseWrapper<>(currencyConversionService.convertCurrency(from, to, amount));
    }

    @GetMapping("/conversions/")
    public ApiResponseWrapper<List<CurrencyConversion>> getAllCurrencyConversions() {
        return new ApiPaginatedResponseWrapper<>(currencyConversionService.getAllCurrencyConversions());
    }

    @GetMapping("/{baseCurrency}/chart/{comparedCurrency}/")
    public ApiResponseWrapper<double[]> getCurrencyValueChart(
            @PathVariable String baseCurrency,
            @PathVariable String comparedCurrency
    ){
        //FIXME: this logic should not be here
        Calendar calendar = Calendar.getInstance();
        Date currentDate = calendar.getTime();
        calendar.add(Calendar.MONTH, -12);
        Date yearAgo = calendar.getTime();
        return new ApiResponseWrapper<>(
                currencyConversionService
                        .getCurrencyValueChart(baseCurrency, comparedCurrency, yearAgo, currentDate)
        );
    }

    @GetMapping("/")
    public ApiResponseWrapper<Map<String, String>> getSupportedCurrencies(){
        return new ApiResponseWrapper<>(currencyConversionService.getSupportedCurrencies());
    }

    @GetMapping("/{id}/")
    public ApiResponseWrapper<Map<String, String>> getDetailedCurrency(
            @PathVariable String id
    )
    {
        return new ApiResponseWrapper<>(currencyConversionService.getSupportedCurrencies());
    }
}