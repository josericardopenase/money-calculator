package com.josericardopenase.apis.rest.v1.currencyconversion;

import com.josericardopenase.core.infraestructure.services.ExchangeService;
import com.josericardopenase.core.infraestructure.repositories.CurrencyConversionRepository;
import com.josericardopenase.extern.services.exchange.MockExchangeService;
import com.josericardopenase.extern.repositories.currencyconversion.InMemoryCurrencyConversionRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CurrencyConversionConfiguration {
    @Bean
    public CurrencyConversionRepository createCurrencyConversionRepository() {
        return new InMemoryCurrencyConversionRepository();
    }

    @Bean
    public ExchangeService createExchangePort() {
        return new MockExchangeService();
    }
}

