package com.josericardopenase.extern.repositories.currencyconversion;

import com.josericardopenase.core.domain.entities.CurrencyConversion;
import com.josericardopenase.core.infraestructure.repositories.CurrencyConversionRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MysqlConversionRepository implements CurrencyConversionRepository {
    @Override
    public Optional<CurrencyConversion> getById(int id) {
        return null;
    }

    @Override
    public List<CurrencyConversion> getAll() {
        return null;
    }

    @Override
    public CurrencyConversion save(CurrencyConversion conversion) {
        return null;
    }

    @Override
    public CurrencyConversion update(CurrencyConversion entity) {
        return null;
    }

    @Override
    public CurrencyConversion delete(CurrencyConversion entity) {
        return null;
    }

    @Override
    public boolean deleteById(int id) {
        return true;
    }
}