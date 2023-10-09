package com.josericardopenase.core.application.usecases;

import com.josericardopenase.core.infraestructure.services.ExchangeService;
import lombok.AllArgsConstructor;
import java.util.Date;

@AllArgsConstructor
public class CurrencyValueChartGenerator {
    final private ExchangeService exchange;

    public double[] generate(String baseCurrency, String comparedCurrency, Date startDate, Date endDate){
        return this.exchange.getCurrencyPriceEvolution(baseCurrency, comparedCurrency, startDate, endDate);
    }
}
