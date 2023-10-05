package com.josericardopenase.core.application.usecases;

import com.josericardopenase.core.infraestructure.ports.ExchangePort;
import lombok.AllArgsConstructor;
import java.util.Map;

@AllArgsConstructor
public class GetSupportedCurrenciesUseCase {
    final private ExchangePort exchange;

    public Map<String, String> execute(){
        return this.exchange.getSupportedCurrencies();
    }
}
