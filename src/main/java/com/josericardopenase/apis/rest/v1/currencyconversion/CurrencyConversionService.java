package com.josericardopenase.apis.rest.v1.currencyconversion;

import com.josericardopenase.core.application.usecases.CurrencyQuantityConverter;
import com.josericardopenase.core.application.usecases.AllCurrencyConversionsSearcher;
import com.josericardopenase.core.application.usecases.CurrencyValueChartGenerator;
import com.josericardopenase.core.application.usecases.AllSupportedCurrenciesSearcher;
import com.josericardopenase.core.domain.entities.CurrencyConversion;
import com.josericardopenase.core.infraestructure.services.ExchangeService;
import com.josericardopenase.core.infraestructure.repositories.CurrencyConversionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class CurrencyConversionService {

    private final ExchangeService exchange;
    private final CurrencyConversionRepository repository;
    @Autowired
    public CurrencyConversionService(ExchangeService exchangePort, CurrencyConversionRepository currencyConversionRepository) {
        this.exchange = exchangePort;
        this.repository = currencyConversionRepository;
    }
    public CurrencyConversion convertCurrency(String from, String to, double amount) {
        var useCase = new CurrencyQuantityConverter(this.exchange, this.repository);
        return useCase.convert(amount, from, to);
    }

    public List<CurrencyConversion> getAllCurrencyConversions() {
        var useCase = new AllCurrencyConversionsSearcher(this.repository);
        return useCase.search();
    }
    public double[] getCurrencyValueChart(String baseCurrency, String comparedCurrency, Date startDate, Date endDate)  {
        var useCase = new CurrencyValueChartGenerator(this.exchange);
        return useCase.generate(baseCurrency, comparedCurrency, startDate, endDate);
    }
    public Map<String, String> getSupportedCurrencies(){
        var useCase = new AllSupportedCurrenciesSearcher(this.exchange);
        return useCase.search();
    }
}