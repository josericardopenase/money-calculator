package com.josericardopenase.core.infraestructure.ports;
import java.util.Date;
import java.util.List;
import java.util.Map;

public interface ExchangePort {
    double getExchangeRate(String fromCurrency, String toCurrency);
    double convertCurrency(String fromCurrency, String toCurrency, double amount);
    double[] getCurrencyPriceEvolution(String baseCurrency, String comparedCurrency,  Date startDate, Date endDate);
    Map<String, String> getSupportedCurrencies();
}


/*
¿Preguntas?

El load(FileReader reader) no rompe el Liskov substitution princple?

¿TsvFileOrganization no tiene dos responsabilidades? Serializar la lectura del archivo con el toOrganization y leer el archivo.

Usar nombre de la interfaz en vez del nombre de la implementacion es para el LSP?

 */