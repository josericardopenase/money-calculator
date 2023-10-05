package com.josericardopenase.extern.repositories.currencyconversion;

import com.josericardopenase.core.domain.entities.CurrencyConversion;
import com.josericardopenase.core.infraestructure.repositories.CurrencyConversionRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryCurrencyConversionRepository implements CurrencyConversionRepository {
    private final List<CurrencyConversion> conversions = new ArrayList<>();
    private int nextId = 1;

    @Override
    public Optional<CurrencyConversion> getById(int id) {
        return conversions.stream()
                .filter(conversion -> conversion.getId() == id)
                .findFirst();
    }

    @Override
    public List<CurrencyConversion> getAll() {
        return new ArrayList<>(conversions);
    }

    @Override
    public CurrencyConversion save(CurrencyConversion conversion) {
        nextId++;
        conversion.setId(nextId);
        conversions.add(conversion);
        return conversion;
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
        int index = -1;
        for (int i = 0; i < conversions.size(); i++) {
            if (conversions.get(i).getId() == id) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            conversions.remove(index);
            return true;
        }
        return false;
    }
}
