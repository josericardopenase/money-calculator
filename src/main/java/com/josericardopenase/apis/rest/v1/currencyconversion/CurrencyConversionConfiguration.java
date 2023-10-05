package com.josericardopenase.apis.rest.v1.currencyconversion;

import com.josericardopenase.core.infraestructure.ports.ExchangePort;
import com.josericardopenase.core.infraestructure.repositories.CurrencyConversionRepository;
import com.josericardopenase.extern.adapters.exchange.MockExchangeAdapter;
import com.josericardopenase.extern.repositories.currencyconversion.InMemoryCurrencyConversionRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CurrencyConversionConfiguration {
    @Bean
    public CurrencyConversionRepository createCategoryRepositoryConverter() {
        return new InMemoryCurrencyConversionRepository();
    }

    @Bean
    public ExchangePort createExchangePort() {
        return new MockExchangeAdapter();
    }
}

