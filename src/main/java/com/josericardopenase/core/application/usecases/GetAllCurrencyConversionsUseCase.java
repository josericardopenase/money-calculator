package com.josericardopenase.core.application.usecases;

import com.josericardopenase.core.domain.entities.CurrencyConversion;
import com.josericardopenase.core.infraestructure.repositories.CurrencyConversionRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class GetAllCurrencyConversionsUseCase {
    final private CurrencyConversionRepository repository;

    public List<CurrencyConversion> execute(){
        return this.repository.getAll();
    }
}
