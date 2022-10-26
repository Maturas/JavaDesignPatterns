package org.example.DesignPatterns.StructuralPatterns.Adapter;

import java.util.List;
import java.util.Optional;

/*
    This is an interface, that is a part of our modern application.
    It's used for accessing databases by the application
 */
public interface NewDataBaseAccessInterface<T> {
    Optional<T> read(String id);
    List<T> readAll();
    Boolean exists(String id);
}
