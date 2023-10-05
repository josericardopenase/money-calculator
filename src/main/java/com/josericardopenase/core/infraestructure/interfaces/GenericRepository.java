package com.josericardopenase.core.infraestructure.interfaces;

import java.util.List;
import java.util.Optional;

public interface GenericRepository<T> {
    Optional<T> getById(int id);
    List<T> getAll();

    // Update
    T save(T entity);
    T update(T entity);
    // Delete
    T delete(T entity);

    boolean deleteById(int id);
}