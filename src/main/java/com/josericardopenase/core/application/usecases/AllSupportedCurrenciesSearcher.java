package com.josericardopenase.core.application.usecases;

import com.josericardopenase.core.infraestructure.services.ExchangeService;
import lombok.AllArgsConstructor;
import java.util.Map;

@AllArgsConstructor
public class AllSupportedCurrenciesSearcher {
    final private ExchangeService exchange;

    public Map<String, String> search(){
        return this.exchange.getSupportedCurrencies();
    }
}
