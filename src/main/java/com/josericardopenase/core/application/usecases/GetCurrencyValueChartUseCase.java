package com.josericardopenase.core.application.usecases;

import com.josericardopenase.core.infraestructure.ports.ExchangePort;
import lombok.AllArgsConstructor;
import java.util.Date;

@AllArgsConstructor
public class GetCurrencyValueChartUseCase {
    final private ExchangePort exchange;

    public double[] execute(String baseCurrency, String comparedCurrency, Date startDate, Date endDate){
        return this.exchange.getCurrencyPriceEvolution(baseCurrency, comparedCurrency, startDate, endDate);
    }
}
