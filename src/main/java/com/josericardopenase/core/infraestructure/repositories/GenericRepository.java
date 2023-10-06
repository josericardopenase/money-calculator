package com.josericardopenase.core.infraestructure.repositories;

import java.util.List;
import java.util.Optional;

public interface GenericRepository<T> {
    Optional<T> getById(int id);
    List<T> getAll();
    T save(T entity);
    T update(T entity);
    T delete(T entity);
    boolean deleteById(int id);
}