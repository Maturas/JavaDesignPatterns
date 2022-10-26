package org.example.DesignPatterns.StructuralPatterns.DataAccessObject;

import java.util.Optional;
import java.util.function.Predicate;

/*
    A standard CRUD implementation
 */
public interface DataAccessObjectInterface<T> {
    Boolean create(T object);
    Optional<T> read(Integer id);
    T[] read();
    T[] read(Predicate<T> predicate);
    Boolean update(Integer id, T updatedObject);
    Boolean delete(Integer id);
}
